package zaroyunu;

import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

public class zaroyunu {

	public static void main(String[] args) {

		
		
	Scanner scan = new Scanner (System.in);
		System.out.println("Birinci oyuncunun ad�n� giriniz. ");
	String  a = scan.nextLine();
	System.out.println("Birinci oyuncu  "+ a);

	Scanner scan2 = new Scanner (System.in);
	System.out.println("�kinci oyuncunun ad�n� giriniz. ");
String  b = scan2.nextLine();
System.out.println("�kinci oyuncu  "+ a);

Scanner scan3 = new Scanner (System.in);
System.out.println("Ka� tur zar oyunu oynamak istersiniz ? ");

int c = scan.nextInt();

int sayi = 0 ;
int sayi2 = 0;


for(int  i= 0; i < c;  i++) {

Random Randomsay� = new Random();
int rastgelesayi;
rastgelesayi = Randomsay�.nextInt(6)+1;
System.out.println("Birinci oyuncunun att��� zar say�s� "+ rastgelesayi);

Random Randomsay�2 = new Random();
int rastgelesayi2;
rastgelesayi2 = Randomsay�2.nextInt(6)+1;
System.out.println("�kinci  oyuncunun att��� zar say�s� "+ rastgelesayi2);
	
if (rastgelesayi>rastgelesayi2)	
{
	System.out.println("Birinci oyuncu daha y�ksek zar say�s� att� Kazanan Birinci oyuncu ");

	sayi++;
}
	else if (rastgelesayi == rastgelesayi2)
{
	System.out.println(" Berabere ");
}else 
{
	System.out.println("�kinci oyuncu daha y�ksek zar say�s� att� kazanan ikinci oyuncu ");
sayi2++;
}

}

if (sayi>sayi2) {
System.out.println("Oyunu " + a + " oyuncusu kazand�. Kazand��� tur say�s� =" +" " + sayi + "\n" +  b + " Oyuncusunun kazand��� tur say�s� = " + sayi2 ); 


}
else if (sayi == sayi2)
{
System.out.print("Oyun berabere bitti.Kazanan yok.");
}
else 
{	
System.out.print("Oyunu " + b + " oyuncusu kazand�. Kazand��� tur say�s� ="+" " + sayi2+ "\n" +  a + " Oyuncusunun kazand��� tur say�s� = " + sayi );

}



	

	
	}

	
}

