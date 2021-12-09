import java.util.Scanner;

public class mulai {
  public static void judul() {
    System.out.println("         SELAMAT DATANG           ");
    System.out.println("----------------------------------");
    System.out.println("      ~PAKET JAWA SENTOSA~        ");
    System.out.println("SIAP MELAYANI SAMPAI GULUNG TIKAR ");
  }

  public static String[] namaKabupaten = { "Kab. Bangkalan", "Kab. Banyuwangi", "Kab. Blitar", "Kab. Bojonegoro",
      "Kab. Bondowoso", "Kab. Gresik", "Kab. Jember", "Kab. Jombang", "Kab. Kediri", "Kab. Lamongan", "Kab. Lumajang",
      "Kab. Madiun", "Kab. Magetan", "Kab. Malang", "Kab. Mojokerto", "Kab. Nganjuk", "Kab. Ngawi", "Kab. Pacitan",
      "Kab. Pamekasan", "Kab. Pasuruan", "Kab. Ponorogo", "Kab. Probolinggo", "Kab. Sampang", "Kab. Sidoarjo",
      "Kab. Situbondo", "Kab. Sumenep", "Kab. Trenggalek", "Kab. Tuban", "Kab. Tulungagung", "Kota Batu", "Kota Blitar",
      "Kota Kediri", "Kota Madiun", "Kota Malang", "Kota Mojokerto", "Kota Pasuruan", "Kota Probolinggo",
      "Kota Surabaya" };
  public static int[][] koordinat = { { 311, 93 }, { 564, 290 }, { 226, 268 }, { 159, 107 }, /** 5. */
      { 495, 225 }, { 283, 105 }, { 459, 274 }, { 229, 169 }, { 206, 214 }, /* 10. */{ 246, 95 }, { 374, 270 },
      { 131, 186 }, { 82, 190 }, { 286, 276 }, /** 15. */
      { 267, 172 }, { 181, 172 }, { 101, 151 }, { 41, 276 }, { 432, 105 }, /** 20. */
      { 320, 204 }, { 102, 232 }, { 404, 222 }, { 380, 115 }, { 312, 156 }, /** 25. */
      { 516, 197 }, { 486, 90 }, { 136, 260 }, { 197, 72 }, { 168, 255 }, /* 30. */{ 274, 214 }, { 214, 260 },
      { 191, 219 }, { 112, 186 }, { 290, 241 }, /** 35. */
      { 259, 159 }, { 334, 190 }, { 384, 210 }, { 303, 128 } };

  public static void tampilkanAsalNamaKabupaten() {
    byte i = 0;
    System.out.println("Asal Kabupaten/Kota");
    while (i < namaKabupaten.length) {
      System.out.println((i + 1) + ". " + namaKabupaten[i]);
      ++i;
    }
  }

  public static int jarak(int a, int b) {
    int hasil = 0;
    if (a < b) {
      for (int i = (a + 1); i <= b; i++) {
        hasil += jarakKabupaten[i];
      }
    } else if (a > b) {
      for (int i = (a - 1); i >= b; --i) {
        hasil += jarakKabupaten[i];
      }
    } else {
      hasil = jarakKabupaten[a];
    }
    return hasil;
  }

  public static void main(String[] args) {
    Scanner pb = new Scanner(System.in);

    tampilkanAsalNamaKabupaten();
    System.out.print("Masukkan asal: ");
    int asal = pb.nextInt() - 1;
    tampilkanTujuanNamaKabupaten();
    System.out.print("Masukkan tujuan: ");
    int tujuan = pb.nextInt() - 1;
    System.out.println("\n" + jarak(asal, tujuan));
    double jarak = (double) jarak(asal, tujuan);
    double total = jarak * 100;
    System.out.println("Total pembayaran" + total);
  }
}