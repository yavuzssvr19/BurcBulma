
package Main;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Koç Burcu : 21 Mart - 20 Nisan

		Boğa Burcu : 21 Nisan - 21 Mayıs

		İkizler Burcu : 22 Mayıs - 22 Haziran

		Yengeç Burcu : 23 Haziran - 22 Temmuz

		Aslan Burcu : 23 Temmuz - 22 Ağustos

		Başak Burcu : 23 Ağustos - 22 Eylül

		Terazi Burcu : 23 Eylül - 22 Ekim

		Akrep Burcu : 23 Ekim - 21 Kasım

		Yay Burcu : 22 Kasım - 21 Aralık

		Oğlak Burcu : 22 Aralık - 21 Ocak

		Kova Burcu : 22 Ocak - 19 Şubat

		Balık Burcu : 20 Şubat - 20 Mart
		
		*/
		Scanner ınp=new Scanner(System.in);
		System.out.println("Ay Giriniz:");
		int month = ınp.nextInt();
		System.out.println("Gün Giriniz: ");
		int day=ınp.nextInt();
		switch(month) {
		case 1:
			if (day>=1 && day<=31) {
				
			if (day<21) {
				System.out.println("Oğlak Burcu");
				
		    }else {
		    	System.out.println("Kova Burcu");
		    
		    }
			}else {
				System.out.println("Geçersiz Gün Girdiniz..");
			}
			break;
			
		case 2:
			if (day>=1 && day<=28) {
			if (day<19) {
				System.out.println("Kova Burcu");
			}else {
				System.out.println("Balık Burcu");
			
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
			
		case 3:
			if (day>=1 && day<=31) {
				
			
			if(day<20) {
				System.out.println("Balık Burcu");
				
			}else {
				System.out.println("Koç Burcu");
			
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 4:
			if (day>=1 && day<=30){
			if (day<20) {
				System.out.println("Koç Burcu");
			}else {
				System.out.println("Boğa Burcu");
			
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 5:
			if (day>=1 && day<=31) {
			if (day<21) {
				System.out.println("Boğa Burcu");
			}else {
				System.out.println("İkizler Burcu");
			
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 6:
			if (day>=1 && day<=30) {
			if (day<22) {
				System.out.println("İkizler Burcu");
				
			}else {
				System.out.println("Yengeç Burcu");
			
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 7:
			if (day>=1 && day<=31) {
			if (day<22) {
				System.out.println("Yengeç Burcu");
			}else {
				System.out.println("Aslan Burcu");
			
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 8:
			if (day>=1 && day<=31) {
			if (day<22) {
				System.out.println("Aslan Burcu");
			}else {
				System.out.println("Başak Burcu");
			
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 9:
			if (day>=1 && day<=30) {
			if (day<22) {
				System.out.println("Başak Burcu");
			}else {
				System.out.println("Terazi Burcu");
				
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 10:
			if (day>=1 && day<=31) {
			if (day<22) {
				System.out.println("Terazi Burcu");
			}else {
				System.out.println("Akrep Burcu");
				
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 11:
			if (day>=1 && day<=30) {
			if (day<21) {
				System.out.println("Akrep Burcu");
			}else {
				System.out.println("Yay Burcu");
				
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		case 12:
			if (day>=1 && day<=31) {
			if (day<21) {
				System.out.println("Yay Burcu");
			}else {
				System.out.println("Oğlak Burcu");
				
			}
			}else {
				System.out.println("Geçersiz Gün Girdiniz");
			}
			break;
		default:
			System.out.println("Geçersiz Bir ay Girdiniz");
		}


	}

}
