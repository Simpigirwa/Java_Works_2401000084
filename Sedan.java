package Com.Javaoop.Works;

public class Sedan extends Car implements Convertible{

	

	private String sedan;

	public Sedan(String make, String model, int year, String sedanValue) {
		super(make, model, year);
		this.sedan=sedanValue;
	}

	public String getSedan() {
		return sedan;
	}

	public void setSedan(String sedan) {
		this.sedan = sedan;
	}
@Override
public void printDetails() {
	System.out.println("Sedan: " + sedan);
}
public void openRoof() {
    System.out.println("Opening the roof of the sedan.");
}
}
