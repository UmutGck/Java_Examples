package Dersler;
import java.util.Scanner;
public class dik_Ucgen {

	public static void main(String[] args) {
	double a, b, c, cevre, alan, u;
	
	// kullaınıdan değer alma
     Scanner input= new Scanner(System.in);
     System.out.println("Birinci kenarı giriniz :");
     a=input.nextDouble();
     System.out.println("İirinci kenarı giriniz :");
     b=input.nextDouble();
     System.out.println("Üçüncü kenarı giriniz :");
     c=input.nextDouble();
     
     cevre = a + b + c ;
     u = cevre/2;
     alan= Math.sqrt(u * (u - a) * (u - b) * (u - c));
     System.out.println("Üçgenin Alanı"  +  alan );
	}

}
