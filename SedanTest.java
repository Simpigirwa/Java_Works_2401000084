package Com.Javaoop.Works;


public class SedanTest {

	public SedanTest() {

	}
public static void main(String[] args) {
	Sedan sd=new Sedan("Toyota", "Honda", 2018, "Exercise");
	System.out.println("Make:"+sd.getMake()+" Model: "+sd.getModel()+" Year: "
	+sd.getYear()+" Sedan value: "+sd.getSedan());
	// call override method
	sd.printDetails();
	
	//print openRoof method
	
	sd.openRoof();
}
}
