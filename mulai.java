import java.util.Scanner;
public class mulai {
   
    static String[] jenisLayanan = {"Reguler", "Kilat", "Ekonomis", "Special Service"};
	static int[] hargaLayanan = {7000, 10000, 4000, 15000};
	
	static String[] jenisPacking = {"Tanpa Tambahan", "Tambah Packing Kardus", "Tambah Packing Kardus"};
	static int[] hargaPacking = {0, 3000, 15000};
	
	
	static void tampilLayanan(){
	  System.out.println("\n---Pilihan Layanan---\n");
    for (int i=0; i<jenisLayanan.length; i++) {
      System.out.println((i+1) + ". " + jenisLayanan[i]);
    }
  }			
  
  static void tampilPacking(){
	  System.out.println("\n---Pilihan Packing---\n");
    for (int i=0; i<jenisPacking.length; i++) {
      System.out.println((i+1) + ". " + jenisPacking[i]);
    }
  }		


 public static void main(String[] args) {
	 tampilLayanan();
	 System.out.print("\nMasukkan Pilihan Layanan: ");
     int layanan = sc.nextInt()-1;
	 System.out.println("Harga: Rp. "+hargaLayanan[layanan]);
	 
	 tampilPacking();
	 System.out.print("\nMasukkan Pilihan Packing: ");
     int pack = sc.nextInt()-1;
	 System.out.println("Harga: Rp. "+hargaPacking[pack]);
	 System.out.print("----------------------------");
	 System.out.println("\nTotal: Rp. " +(hargaLayanan[layanan]+hargaPacking[pack]));
}