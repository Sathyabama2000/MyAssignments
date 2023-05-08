package week1.day2;

public class Mobile {
    
	 String mobileBrandName = "vivo";
	 char mobileLogo = 's';
	 short noOfMobilePiece = 5;
	 int modelNumber = 1999;
	 long mobileMeiNumber = 12345678909876l;
	 float mobilePrice = 15000.00f;
	 boolean isDamaged = false;
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile features = new Mobile();
		
        System.out.println(features.mobileBrandName);
        System.out.println(features.mobileLogo);
        System.out.println(features.noOfMobilePiece);
        System.out.println(features.modelNumber);
        System.out.println(features.mobileMeiNumber);
        System.out.println(features.mobilePrice);
        System.out.println(features.isDamaged);
             
	}

}
