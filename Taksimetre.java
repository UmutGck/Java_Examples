package Dersler;
import java.util.Scanner;
public class taksimetre_Ucret {

	public static void main(String[] args) {
	
		//Taksimetre KM başına 2.20 TL tutmaktadır.
		//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
		//Taksimetre açılış ücreti 10 TL'dir.
		
		int km, startPrince = 10;
		 double total, perKm = 2.00; // kilometre başına ücret
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Gideceğiniz KM mesafesini Giriniz :");
		 km = input.nextInt();
		 
		 total = (km * perKm)+ startPrince ;
		 
		
		 total = (total<20) ? 20:total;
		 System.out.println("Ödenecek tutar  :" + total  );
		 
	}

}
