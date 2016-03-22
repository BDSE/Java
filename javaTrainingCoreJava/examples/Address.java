package examples;

public class Address {
	private String hno;
	private String Addressline;

	Address(String hno, String Addressline) {
		this.hno = hno;
		this.Addressline = Addressline;
	}

	public String getHno() {
		return hno;
	}

	public String getAddressLine() {
		return Addressline;
	}
}
