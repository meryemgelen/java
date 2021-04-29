package menu;

import java.util.Scanner;

import beans.Personel;
import business.PersonelBusiness;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    public void anaMenu() {
	try {
	    int s = 0;
	    do {
		System.out.println("Ana menü");
		System.out.println();
		System.out.println("1-Personel Listesi");
		System.out.println("2-PersonelEkleme");
		System.out.println("3-Personel Silme");
		System.out.println("4-Çýkýþ");
		System.out.println("Seçiminiz...");
		String secim = sc.next();
		try {
		    s = Integer.parseInt(secim);
		    switch (s) {
		    case 1:
			personelListesi();
			break;
		    case 2:
			personelEkleme();
			break;
		    case 3:
			personelSilme();
			break;
		    default:
			if (s != 4) {
			    System.out.println("Hatalý Seçim Yaptýnýz");
			}
		    }
		} catch (Exception e) {
		    System.out.println("Yanlýþ seçim yaptýnýz");
		}
	    } while (s != 4);
	} finally {
	    sc.close();
	}
	System.out.println("Hoþçakalýn...");
    }

    private void personelSilme() {
	System.out.println("Personel Silme");
	new PersonelBusiness().getPersoneller().forEach(p -> System.out.println(p.getId() + " - " + p.toString()));
	System.out.println("Silinecek personelin numarasýný giriniz = ");
	int id = sc.nextInt();
	try {
	    new PersonelBusiness().personelSil(id);
	    System.out.println("Personel Silindi");
	} catch (Exception e) {
	    System.out.println("Personel silinemedi");
	}

    }

    private void personelEkleme() {
	System.out.println("personel ekleme");
	System.out.print("Personel TcNo : ");
	String tcNo = sc.next();
	System.out.print("Personel Adi : ");
	String adi = sc.next();
	System.out.print("Personel Soyadi : ");
	String soyadi = sc.next();

	Personel personel = new Personel(0, tcNo, adi, soyadi);
	try {
	    new PersonelBusiness().personelEkle(personel);
	    System.out.println("Personel Oluþturuldu");
	} catch (Exception e) {
	    System.out.println("Personel Oluþturulamadý");
	}
    }

    private void personelListesi() {
	// System.out.println("Personel Listesi geldi");
	new PersonelBusiness().getPersoneller().forEach(System.out::println);
    }
}
