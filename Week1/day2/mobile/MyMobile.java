package day2.mobile;

public class MyMobile {
	
		public void sendMessage() {
			System.out.println("Selenium with Java");
		}
		
		public void sharedDocuments() {
			System.out.println("Selenium with Python");
		}
		
		public void call() {
			System.out.println("call");
		}

		public static void main(String[] args) {
			MyMobile mob=new MyMobile();
			mob.call();
			mob.sendMessage();
			mob.sharedDocuments();
		}
		
	}
