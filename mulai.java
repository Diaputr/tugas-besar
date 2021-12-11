package com.Math;

import java.util.Scanner;

public class mulai {
  public static void judul() {
    System.out.println("         SELAMAT DATANG           ");
    System.out.println("----------------------------------");
    System.out.println("   ~PAKET JAWA TIMUR SENTOSA~     ");
    System.out.println("SIAP MELAYANI SAMPAI GULUNG TIKAR ");
  }	
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

  public static double[][] koordinat = { { 311, 93 }, { 564, 290 }, { 226, 268 }, { 159, 107 }, /** 5. */
      { 495, 225 }, { 283, 105 }, { 459, 274 }, { 229, 169 }, { 206, 214 }, /* 10. */{ 246, 95 }, { 374, 270 },
      { 131, 186 }, { 82, 190 }, { 286, 276 }, /** 15. */
      { 267, 172 }, { 181, 172 }, { 101, 151 }, { 41, 276 }, { 432, 105 }, /** 20. */
      { 320, 204 }, { 102, 232 }, { 404, 222 }, { 380, 115 }, { 312, 156 }, /** 25. */
      { 516, 197 }, { 486, 90 }, { 136, 260 }, { 197, 72 }, { 168, 255 }, /* 30. */{ 274, 214 }, { 214, 260 },
      { 191, 219 }, { 112, 186 }, { 290, 241 }, /** 35. */
      { 259, 159 }, { 334, 190 }, { 384, 210 }, { 303, 128 } };

  public static void tampilinBagus() {
    System.out.println("Pilihan Kota/Kabupaten");
    System.out.println("1. Kab. Bangkalan   11. Kab. Lumajang   21. Kab. Ponorogo     31. Kota Blitar");
    System.out.println("2. Kab. Banyuwangi  12. Kab. Madiun     22. Kab. Probolinggo  32. Kota Kediri");
    System.out.println("3. Kab. Blitar      13. Kab. Magetan    23. Kab. Sampang      33. Kota Madiun");
    System.out.println("4. Kab. Bojonegoro  14. Kab. Malang     24. Kab. Sidoarjo     34. Kota Malang");
    System.out.println("5. Kab. Bondowoso   15. Kab. Mojokerto  25. Kab. Situbondo    35. Kota Mojokerto");
    System.out.println("6. Kab. Gresik      16. Kab. Nganjuk    26. Kab. Sumenep      36. Kota Pasuruan");
    System.out.println("7. Kab. Jember      17. Kab. Ngawi      27. Kab. Trenggalek   37. Kota Probolinggo");
    System.out.println("8. Kab. Jombang     18. Kab. Pacitan    28. Kab. Tuban        38. Kota Surabaya");
    System.out.println("9. Kab. Kediri      19. Kab. Pamekasan  29. Kab. Tulungagung  ");
    System.out.println("10. Kab. Lamongan   20. Kab. Pasuruan   30. Kota Batu         ");
  }

  public static double jarak(int a, int b) {
    double x = 0, y = 0, jarak = 0, hasil = 0;
    if (a == b) {
      x = koordinat[a][0];
      y = koordinat[a][1];
      jarak = Math.sqrt((x * x) + (y * y));
      hasil = jarak * 100;
    } else {
      x = koordinat[b][0] - koordinat[a][0];
      y = koordinat[b][1] - koordinat[a][1];
      jarak = Math.sqrt((x * x) + (y * y));
      hasil = jarak * 100;
    }
    return hasil;
  }

  static String[] alamat = new String[2];
  static String[] noHP = new String[2];
  static String[] nama = new String[2];

  public static void main(String[] args) {
    Scanner pb = new Scanner(System.in);
    // pengirim
    System.out.println("-------Pengirim-------");
    System.out.print("Nama Pengirim: ");
    nama[0] = pb.nextLine();
    System.out.print("Nomor HP pengirim: ");
    noHP[0] = pb.nextLine();
    tampilinBagus();
    System.out.print("Masukkan asal: ");
    int asal = pb.nextInt() - 1;
    pb.nextLine();
    System.out.print("Alamat rinci pengirim: ");
    alamat[0] = pb.nextLine();
    // // penerima
    System.out.println("-------Penerima-------");
    System.out.print("Nama Penerima: ");
    nama[1] = pb.nextLine();
    System.out.print("Nomor HP Penerima: ");
    noHP[1] = pb.nextLine();
    tampilinBagus();
    System.out.print("Masukkan tujuan: ");
    int tujuan = pb.nextInt() - 1;
    pb.nextLine();
    System.out.print("Alamat rinci penerima: ");
    alamat[1] = pb.nextLine();

    int jarak = (int) jarak(asal, tujuan);
    System.out.println("\n" + jarak);
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
