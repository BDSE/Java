package cs540;

class Movie {
	public int script, acting, directing;

	public int rating() {
		return script + acting + directing;
	}
}

public class Demo {
	public static void main (String argv[]) {
	Movie m = new Movie();
	m.script = 6; m.acting = 9; m.directing = 8;
	System.out.print("The rating of this movie is");
	System.out.println(m.rating());
	}
}