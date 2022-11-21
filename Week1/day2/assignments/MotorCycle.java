package day2.assignments;

public class MotorCycle {
	
	
	public void applybrake() {
		System.out.println("applybrake");
	}
	
	public void applygear() {
		System.out.println("applygear");
    }

	public void switchOnAc() {
		System.out.println("switchOnAc");
    }
	
	public void applyAccelerate() {
		System.out.println("applyAccelerate");
	}

	public static void main(String[] args) {
		MotorCycle mcwg=new MotorCycle();
		mcwg.applybrake();
		mcwg.applygear();
		mcwg.switchOnAc();
		mcwg.applyAccelerate();
	}
}
