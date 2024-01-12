package Com.Javaoop.Works;

public class Car extends Vehicle{
private String make;
private String model;
private int year;
private Engine engine;
private static int totalCars = 0;
private InvalidYearException exception;
public Car() {
totalCars++;	
}
public Car(String make, String model, int year) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	totalCars++;
}

public Car(String make, String model, int year, int horsepower, String fuelType) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.engine = new Engine(horsepower, fuelType);
	totalCars++;
}


public Car(InvalidYearException exception) {
	super();
	this.exception = exception;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}

public InvalidYearException getException() {
	return exception;
}
public void setException(InvalidYearException exception) {
	this.exception = exception;
}
//Method that will be override
public void printDetails() {
    System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
}
@Override
public void start() {
    System.out.println("Starting the car.");
	
}
public static int getTotalCars() {
    return totalCars;
}

public void checkYearValidity(int year) throws InvalidYearException {
    if (year < 2015) {
        throw new InvalidYearException("That car is too old. We do not need it!");
    }else if(year>2024) {
    	throw new InvalidYearException("Invalid year for a car.");
	}
}

}
