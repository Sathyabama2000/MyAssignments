package org.system;
//single inheritance
public class Desktop extends Computer {
	
     public void desktopSize()
     {
    	 System.out.println("size");
     }
     public void keyboard()
     {
    	 System.out.println("keyboard");
     }
     
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.memory();
		obj.gaming();
		obj.desktopSize();
		obj.keyboard();

	}

}
