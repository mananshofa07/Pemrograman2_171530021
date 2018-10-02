public class Transaksi{
	public static void main(String[] args) {
		int barA = 12345;
		int barB = 67890;
		int barC = 15432;
		int barD = 76542;
		int barE = 23453;
		int total = barA+barB+barC+barD+barE;
		int bayar = 300000;
		int kembali = bayar-total;
		float i = total;
		byte k = (byte) kembali;


		System.out.println("Harga Barang A = " + barA);
		System.out.println("Harga Barang B = " + barB);
		System.out.println("Harga Barang C = " + barC);
		System.out.println("Harga Barang D = " + barD);
		System.out.println("Harga Barang E = " + barE);
		System.out.println("Total Harga = " + i);
		System.out.println("Total Bayar = " + bayar);
		System.out.println("Kembalian = " + k);



	}
}