package Com.Javaoop.Works;

public class CarTest {

	public static void main(String[] args) {
		
		//with no arguments
		
		Car car1 =new Car();	
		String mk="Benz";
		String md="Rukururana";
		int mdy=2010;
		car1.setMake(mk);
		car1.setModel(md);
		car1.setYear(mdy);
		
		
		System.out.println("Car make "+car1.getMake()+" With model "+car1.getModel()+
				" and made in "+car1.getYear());
		
		
		//with arguments in constructor
		Car car2=new Car("Toyota", "Gikumi", 2023);
		System.out.println("Car make "+car2.getMake()+" With model "+car2.getModel()+
				" and made in "+car2.getYear());
		
		//calling printDetails method
		car1.printDetails();
		
		Car car3=new Car("Toyota", "Suzuki", 2010, 25, "Gas") ;

		System.out.println("Car make: "+car3.getMake()+" With model: "+car3.getModel()+
				" and made in: "+car3.getYear()+" Horse power: "+car3.getEngine().getHorsepower()
				+" Fuel type: "+car3.getEngine().getFuelType());
		//call start method
		car1.start();
		
		//display total number of cars created
		System.out.println(car3.getTotalCars());
		
	Car car4=new Car();
	try {
        car4.checkYearValidity(car1.getYear());
    } catch (InvalidYearException e) {
        System.out.println("\nException: " + e.getMessage()+" "+car1.getYear());
    }

	
			}

}
