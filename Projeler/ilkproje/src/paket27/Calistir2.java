package paket27;

public class Calistir2 {

    public static void main(String[] args) {
	int[][] sayilar = new int[2][];
	sayilar[0] = new int[] { 1, 3, 4 };
	sayilar[1] = new int[] { 2, 8 };
	System.out.println(sayilar.length);
	System.out.println(sayilar[0].length);
	System.out.println(sayilar[1].length);
	System.out.println(sayilar[0][1]);
	System.out.println(sayilar[1][1]);

	System.out.println("--------------------------");

	int[][] sayilar2 = { { 1, 3, 4 }, { 2, 8 } };

	System.out.println(sayilar2.length);
	System.out.println(sayilar2[0].length);
	System.out.println(sayilar2[1].length);
	System.out.println(sayilar2[0][1]);
	System.out.println(sayilar2[1][1]);
    }
}