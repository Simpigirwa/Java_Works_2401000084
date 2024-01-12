package Com.Javaoop.Works;

public class Engine {
	int horsepower;
	String fuelType;
	public Engine(int horsepower, String fuelType) {
		super();
		this.horsepower = horsepower;
		this.fuelType = fuelType;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void printEngineDetails() {
		System.out.println("Horsepower: " + horsepower + ", Fuel Type: " + fuelType);
	}

}
