package day1.assignment1;

public class MotorCycle {
        int noOfWheels=2;
        short noOfMirrors=2;
        long chassisNumber=78678956725261456L;
        boolean isPunctured=false;
        double runningKM=12247.80;
        String bikeName= "Royal Enfield";
public static void main(String[] args) {
		MotorCycle bike=new MotorCycle();
		System.out.println("No.of Wheels-"+bike.noOfWheels);
		System.out.println("No.of Mirrors-"+bike.noOfMirrors);
		System.out.println("Chassis Number-"+bike.chassisNumber);
		System.out.println("Tyre Punctured-"+bike.isPunctured);
		System.out.println("Bike Travelled(km)-"+bike.runningKM);
		System.out.println("Brand Name-"+bike.bikeName);
	}
        		
	}
