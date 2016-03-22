package cs540;

public class FabonacciSeries {
	public static void main(String[] args) {
		int hi = 1;
		int lo = 1;
		System.out.print(lo+" ");
		while (hi < 100) {
			System.out.print(hi+" ");
			hi = hi + lo;
			lo = hi - lo;
		}
	}
}
