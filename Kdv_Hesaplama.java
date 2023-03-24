package Dersler;
import java.util.Scanner;

public class kdv_hesaplama {

	public static void main(String[] args) {
		
		double kdvsizFiyat, kdvliFiyat, kdvOranı, kdvTutarı;
		Scanner input= new Scanner(System.in);
		
	    System.out.println("Fiyat Giriniz  :");
	    kdvsizFiyat = input.nextDouble();
	    
	    kdvOranı= (kdvsizFiyat >=0) && (kdvsizFiyat<=1000) ? 0.18: 0.8;
	    
	    kdvTutarı = kdvsizFiyat * kdvOranı ;
	    kdvliFiyat = kdvsizFiyat + kdvTutarı;
	    
	    System.out.println("Kdv siz Fİhat :   " + kdvsizFiyat);
	    System.out.println("Kdv oranı :   " + kdvOranı);
	    System.out.println("Kdv tutarı :   " + kdvTutarı);
	    System.out.println("Kdv li Fİhat :   " + kdvliFiyat);
	        
	    
	    
	}
