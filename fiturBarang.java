import java.util.Scanner;
public class fiturBarang{

	static String[] jenisBarang = {"Elektronik/Gadget", "Farmasi/Kosmetik", "Makanan/Minuman", "Pakaian", "Pecah Belah"};

	static double barang(double berat, double jml){
		int[] harga = {5000, 10000, 15000};
		double bayar = 0;
		if(berat>=0 && berat<5){
			bayar=jml*berat*harga[0];
			
		} else if(berat>=5 && berat<10){
			bayar=jml*berat*harga[1];
			
		} else if(berat>=10){
			bayar=jml*berat*harga[2];
		} else {
			System.out.println("Error");
		}
		return bayar;
	}

	static void tampilBarang(){
	  System.out.println("\n---Informasi Barang---\n");
    for (int i=0; i<jenisBarang.length; i++) {
      System.out.println((i+1) + ". " + jenisBarang[i]);
    }
  }
  
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
     	tampilBarang();
	
	System.out.print("\nPilih jenis barang : ");
	int jenis = input.nextInt();
	
	input.nextLine();
	System.out.print("\nNama barang : ");
	String nama = input.nextLine();
	
	System.out.print("\nBerat barang (kg) : ");
	double berat = input.nextDouble();
	
	System.out.print("\nJumlah barang : ");
	double jml = input.nextInt();
	
	input.nextLine();
	System.out.print("\nTambah catatan/keterangan : ");
	String ket = input.nextLine();
	
	System.out.println("Harga menurut berat barang : Rp. "+barang(berat, jml));

  }
}
