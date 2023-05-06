package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("we can apply break ");
	}
	public void applyGear() {
		System.out.println("we can apply gear");
	}
	public void switchOnAc() {
		System.out.println("we can switch on the Ac");
	}
    public void applyAccelerate() {
    	System.out.println("we can apply accelerate");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car car = new Car();
     car.applyBreak();
     car.applyGear();
     car.switchOnAc();
     car.applyAccelerate();
	}

}
