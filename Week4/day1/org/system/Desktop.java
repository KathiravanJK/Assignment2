package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("14 Inches");
	}
	
	public static void main(String[] args) {
		Desktop Pc=new Desktop();
		Pc.desktopSize();
		Pc.computerModel();
	}

}
