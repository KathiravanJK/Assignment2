package day1.assignment2;

public class MobilePhone {
	String mobileBrandName="Gionee";
	char mobileLogo='G';
	short noOfMobilePiece=6;
	int modelNumber=242332523;
	long mobileImeiNumber=860545051937577L;
	float mobilePrice=14999.00F;
	boolean isDamaged=true;

public static void main(String[] args) {
	MobilePhone mobile=new MobilePhone();
	System.out.println("Brand Name-"+mobile.mobileBrandName);
	System.out.println("Mobile Logo-"+mobile.mobileLogo);
	System.out.println("No. of Mobile-"+mobile.noOfMobilePiece);
	System.out.println("Model Number-"+mobile.modelNumber);
	System.out.println("IMEI Number-"+mobile.mobileImeiNumber);
	System.out.println("Price-"+mobile.mobilePrice);
	System.out.println("Phone Damaged-"+mobile.isDamaged);
}
	
}
