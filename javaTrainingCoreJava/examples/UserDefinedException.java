package examples;

public class UserDefinedException {
	static String[] myArr = { "a", "b", "d", "g" };

	static void getDivision(String args1, String args2) throws MyException {
		int num1 = Integer.parseInt(args1);
		int num2 = Integer.parseInt(args2);
		float result = 0;

		if (num2 == 0) {
			MyException me = new MyException("cant divide by 0");

			// Exception can be used directly and its constructor can be used to
			// modify the error msg as blow
			// Exception me = new Exception("cant divide sss 0");
			throw me;

		}

		result = num1 / num2;
		System.out.println(result);

	}

	public static void showArrayElement(int index) throws RuntimeExceptionExample {
		int len = myArr.length;

		if (index > len - 1) {
			RuntimeExceptionExample ree = new RuntimeExceptionExample(
					"Array is not that big, it has only " + len + " elements");
			throw ree;
		}
		System.out.println(myArr[index]);
	}

	public static void main(String args[]) {
		int index = Integer.parseInt(args[2]);
		try {
			UserDefinedException.getDivision(args[0], args[1]);
			showArrayElement(index);
		} catch (MyException e) {
			e.printStackTrace();
		} catch (RuntimeExceptionExample e) {
			e.printStackTrace();
		}

	}
}
