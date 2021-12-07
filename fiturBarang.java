import java.util.Scanner;
public class fiturBarang{

	static String[] jenisBarang = {"Buku/Dokumen", "Elektronik/Gadget", "Farmasi", "Kosmetik", 
				"Makanan/Minuman", "Pakaian", "Pecah Belah", "Otomotif", "Dll"};

	static void tampilBarang(){
	  System.out.println("\n---Informasi Barang---\n");
    for (int i=0; i<jenisBarang.length; i++) {
      System.out.println((i+1) + ". " + jenisBarang[i]);
    }
  }
	static double hitungBerat(double g, double h){
	  double harga=0;
	  if (g<=5){
		  harga=5000*h;  
	} else {
		harga=8000*h;
	}
	return harga;
  }
  
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("\nJumlah paket yang akan diantar : ");
	int a = input.nextInt();
	
	for (int i=0; i<a; i++) {
		if (a>1){
		System.out.print("\n*PAKET KE-"+(i+1));
		}
		
     	tampilBarang();
	
	System.out.print("\nPilih jenis barang : ");
	int b = input.nextInt();
	if (b==9){
		input.nextLine();
		System.out.print("\nKetikkan jenis barang : ");
		String dll = input.nextLine();
	} else {
		input.nextLine();
	}
	
	System.out.print("\nNama barang : ");
	String c = input.nextLine();
	
	System.out.print("\nBerat barang (kg) : ");
	double d = input.nextDouble();
	
	System.out.print("\nJumlah barang : ");
	double e = input.nextInt();
	
	input.nextLine();
	System.out.print("\nTambah catatan/keterangan : ");
	String f = input.nextLine();
	
	System.out.println(hitungBerat(d,e));
	
	}
  }
}
