package examples;

public class ArrayExample {
	// single dimension array
	// public int[] arr1 = new int[5];
	int arr1[] = { 10, 40, 343, 66, 7, 8 };

	// multidimension array
	// public int arr2[][] = new int[3][3];
	int[][] arr2 = { { 3, 4, 5 }, { 23, 44, 54 }, { 55, 2, 34 } };

	public static void main(String[] args) {
		ArrayExample ae = new ArrayExample();
		try {
			ae.showMatrix();
		} catch (ArrayIndexOutOfBoundsException arexp) {
			arexp.printStackTrace();
		}
	}

	public void showMatrix() {
		try {

			for (int i = 0; i < arr2.length; i++) {
				for (int j = 0; j < arr2[i].length; j++) {
					System.out.print(arr2[i][j] + "\t");
				}
				System.out.println("");
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			throw new ArrayIndexOutOfBoundsException("dfdfdf");
		}
	}

}
