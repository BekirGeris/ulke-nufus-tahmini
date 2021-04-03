package JavaÖdevler;

import java.util.Scanner;

public class UlkeNüfusTahmini {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ülke nüfusunuz ne kadar");
		double anlıkNüfus = input.nextDouble(); 
		System.out.println("Kaç yıl sonrasını tahmin edelim (örn;8)");
		double tahminYılı = input.nextDouble();
		System.out.println("Kaç saniyede kaç kişi ölüyor giriniz (örn;8 5)");
		double deathSaniyesi = input.nextDouble();
		double deathsayisi = input.nextDouble();
		System.out.println("Kaç saniyede kaç kişi doğuyor giriniz (örn;10 9)");
		double birthSaniyesi = input.nextDouble();
		double birthsayisi = input.nextDouble();
		System.out.println("Kaç saniyede ne kadar göç oluyor giriniz (örn;10 9)");
		double immigrationSaniyesi = input.nextDouble();
		double immigrationSayisi = input.nextDouble();
		input.close();
		double toplamSaniye = 365 * 24 * 60 * 60;
		double yıllıkDeath = toplamSaniye / deathSaniyesi * deathsayisi;
		double yıllıkBirth = toplamSaniye / birthSaniyesi * birthsayisi;
		double yıllıkİmmigration = toplamSaniye / immigrationSaniyesi * immigrationSayisi;
		int i=0;
		for (i = 1;i <= tahminYılı;i++) {
			double tahminiNüfus = anlıkNüfus + (yıllıkBirth - yıllıkDeath + yıllıkİmmigration) * i;
			System.out.println(i + " yıl sonra nüfusunuz = " + (int)tahminiNüfus);
		}
	}
}

