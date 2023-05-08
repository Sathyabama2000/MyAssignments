package week1.day2;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors =6;
	long chassisNumber = 98765432101234567l;
	boolean isPunctured = false;
	String bikeName = "Apache";
	double runningKm = 85.50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		TwoWheeler vehicle = new TwoWheeler();
		System.out.println(vehicle.noOfWheels);
		System.out.println(vehicle.noOfMirrors);
		System.out.println(vehicle.chassisNumber);
		System.out.println(vehicle.isPunctured);
		System.out.println(vehicle.bikeName);
		System.out.println(vehicle.runningKm);

	}

}
