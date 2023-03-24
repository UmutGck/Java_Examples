package Dersler;
import java.util.Scanner;
public class Ort_Hesaplama {

	public static void main(String[] args) {
	
		//Değişkenleri tanımla
		int mat, fizik, kimya, turkce, tarih, muzik;
		 
		//Scanner Sınıfını Tanımlama
        Scanner inp= new Scanner(System.in);
        
        //Kullanıcıdan Değer Al
        
        System.out.println("Matematik Notunuzu Giriniz");
        mat = inp.nextInt();
        
        System.out.println("Fizik Notunuzu Giriniz");
        fizik = inp.nextInt();
        
        System.out.println("Kimya Notunuzu Giriniz");
        kimya = inp.nextInt();
        
        System.out.println("Turkce Notunuzu Giriniz");
        turkce = inp.nextInt();
        
        System.out.println("Tarih Notunuzu Giriniz");
        tarih = inp.nextInt();
        
        System.out.println("Müzik Notunuzu Giriniz");
        muzik = inp.nextInt();
        
        int toplam = (mat+ fizik+ kimya +turkce + tarih +muzik );
        double ortalama = toplam/6.00;
        System.out.print("Ortalamanız :  "+ ortalama);
        
        boolean kosul = ortalama>=60;
        String sonuc = kosul? "Sınıfı Geçtin"  : "Sınıfta kaldın";
        System.out.println(sonuc);
