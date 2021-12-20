import java.util.Random;
import java.util.Calendar;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;

public class Ekspedisi {

    public static void judul() {
        System.out.println("\t\t\t         SELAMAT DATANG           ");
        System.out.println("\t\t\t--------------------------------");
        System.out.println("\t\t\t   PAKET JAWA TIMUR SENTOSA     ");
        System.out.println("\t\t\tSIAP MELAYANI SAMPAI GULUNG TIKAR");
    }

    public static Scanner pb = new Scanner(System.in);
    public static String[] namaCustom = new String[2];
    public static String[] noHP = new String[2];
    public static String[] alamat = new String[2];
    static boolean ulang = true;

    public static void tampilkanKota() {
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

    public static double[][] koordinat = { { 311, 93 }, { 564, 290 }, { 226, 268 }, { 159, 107 }, /** 5. */
            { 495, 225 }, { 283, 105 }, { 459, 274 }, { 229, 169 }, { 206, 214 }, /* 10. */{ 246, 95 }, { 374, 270 },
            { 131, 186 }, { 82, 190 }, { 286, 276 }, /** 15. */
            { 267, 172 }, { 181, 172 }, { 101, 151 }, { 41, 276 }, { 432, 105 }, /** 20. */
            { 320, 204 }, { 102, 232 }, { 404, 222 }, { 380, 115 }, { 312, 156 }, /** 25. */
            { 516, 197 }, { 486, 90 }, { 136, 260 }, { 197, 72 }, { 168, 255 }, /* 30. */{ 274, 214 }, { 214, 260 },
            { 191, 219 }, { 112, 186 }, { 290, 241 }, /** 35. */
            { 259, 159 }, { 334, 190 }, { 384, 210 }, { 303, 128 } };

    // pengirim
    public static int inputPengirim() {
        System.out.println("\n------- Pengirim -------");
        System.out.print("Nama Pengirim: ");
        namaCustom[0] = pb.nextLine();
        System.out.print("Nomor HP Pengirim: ");
        noHP[0] = pb.nextLine();
        tampilkanKota();
        System.out.print("Masukkan Asal: ");
        int asal = pb.nextInt() - 1;
        pb.nextLine();
        System.out.print("Alamat Rinci Pengirim: ");
        alamat[0] = pb.nextLine();
        return asal;
    }

    public static int inputPenerima() {
        System.out.println("\n------- Penerima -------");
        System.out.print("Nama Penerima: ");
        namaCustom[1] = pb.nextLine();
        System.out.print("Nomor HP Penerima: ");
        noHP[1] = pb.nextLine();
        tampilkanKota();
        System.out.print("Masukkan Tujuan: ");
        int tujuan = pb.nextInt() - 1;
        pb.nextLine();
        System.out.print("Alamat Rinci Penerima: ");
        alamat[1] = pb.nextLine();
        return tujuan;
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

    //barang
    public static String[] jenisBarang = { "Elektronik/Gadget", "Farmasi/Kosmetik", "Makanan/Minuman", "Pakaian", "Pecah Belah" };

    public static void tampilBarang() {
        System.out.println("\n------- Informasi Barang --------");
        for (int i = 0; i < jenisBarang.length; i++) {
            System.out.println((i + 1) + ". " + jenisBarang[i]);
        }
    }

    public static double menghitungHargaBarangPerBerat(double berat, int jml) {
        int[] harga = { 5000, 10000, 15000 };
        double bayar = berat * jml;
        if (berat >= 0 && berat < 5) {
            bayar *= harga[0];

        } else if (berat >= 5 && berat < 10) {
            bayar *= harga[1];

        } else if (berat >= 10) {
            bayar *= harga[2];

        } else {
            System.out.println("Error");
        }
        return bayar;
    }

    //layanan
    public static String[] jenisLayanan = {  "Ekonomis", "Reguler", "Kilat", "Special Service" };
    public static int[] hargaLayanan = { 4000, 7000, 10000, 15000 };

    public static String[] jenisPacking = { "Tanpa Tambahan", "Tambah Packing Kardus", "Tambah Packing Kayu" };
    public static int[] hargaPacking = { 0, 3000, 15000 };

    public static void tampilLayanan() {
        System.out.println("\n------- Pilihan Layanan -------");
        for (int i = 0; i < jenisLayanan.length; i++) {
            System.out.println((i + 1) + ". " + jenisLayanan[i]);
        }
    }

    public static void tampilPacking() {
        System.out.println("\n------- Pilihan Packing -------");
        for (int i = 0; i < jenisPacking.length; i++) {
            System.out.println((i + 1) + ". " + jenisPacking[i]);
        }
    }

    public static String tampilkanTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();

        return dateFormat.format(cal.getTime());
    }
    // resi
    public static int[] resi() {
        Random acak = new Random();
        int[] kode = new int[10];
        for (int i = 0; i < kode.length; i++) {
            kode[i] = (acak.nextInt(10)); // 0-9
        }
        return kode;
    }

    public static void menampilkanOutput(int[] lacak, String[] pengirim, int jenis, String nama, double berat, int jml,
                                         int perhitungan, String pembayaran, int Layanan, String keterangan) {
        System.out.println("\n\n============ Bukti Pengiriman ============");
        System.out.print("No Resi: ");
        for (int a = 0; a < lacak.length; a++) {
            System.out.print(lacak[a]);
        }
        System.out.print("\nTanggal: ");
        System.out.println(tampilkanTanggal());
        System.out.println("==========================================");
        System.out.println("Pengirim          : " + pengirim[0]);
        System.out.println("Penerima          : " + pengirim[1]);
        System.out.println("Jenis Barang      : " + jenisBarang[jenis]);
        System.out.println("Nama Barang       : " + nama);
        System.out.printf("Berat Barang      : %.2f Kg\n", berat);
        System.out.println("Jumlah Barang     : " + jml);
        System.out.println("Jenis Layanan     : " + jenisLayanan[Layanan]);
        System.out.println("Tarif             : Rp. " + perhitungan);
        System.out.println("Jenis Pembayaran  : " + pembayaran);
        System.out.println("Keterangan        : " + keterangan);
    }

    public static void menu() {
        System.out.println("\n------- MENU -------");
        System.out.println("1. Mengirim Paket");
        System.out.println("2. Daftar Harga");
        System.out.println("3. Cek Tarif Pengiriman");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu: ");
        int pil = pb.nextInt();
		pb.nextLine();
        if (pil==1){
            return;
        } else if (pil==2){
            System.out.println("\n------- Daftar Harga -------");
            System.out.println("A) Harga Berat\n1. <5 	kg	: Rp. 5000\n2. 5-10	kg	: Rp. 10000\n3. >10	kg	: Rp. 15000");
            System.out.println("\nB) Harga Layanan\n1. Ekonomis	: Rp. 4000\n2. Reguler	: Rp. 7000\n3. Kilat	: Rp. 10000\n4. Special	: Rp. 15000");
            System.out.println("\nC) Harga Packing\n1. Kardus	: Rp. 3000\n2. Kayu		: Rp. 15000");
            menu();
        } else if (pil==3){
            System.out.println("\n------- Cek Tarif Pengiriman -------");
            tampilkanKota();
            System.out.print("\nDaerah Asal: ");
            int asal = pb.nextInt() - 1;
            System.out.print("Daerah Tujuan: ");
            int tujuan = pb.nextInt() - 1;

            int harga = (int) jarak(asal,tujuan);

            System.out.println("\n------- Informasi Barang --------");
            System.out.print("Berat Barang (kg): ");
            double berat = pb.nextDouble();
            System.out.print("Jumlah Barang: ");
            int jml = pb.nextInt();

            int jumlah = (int) menghitungHargaBarangPerBerat(berat,jml);

            tampilLayanan();
            System.out.print("Pilih Layanan: ");
            int layanan = pb.nextInt() - 1;
            tampilPacking();
            System.out.print("Pilih Packing: ");
            int pack = pb.nextInt() - 1;

            int total = (int) harga + jumlah + hargaLayanan[layanan] + hargaPacking[pack];

            System.out.println("\n-----------------------------------");
            System.out.println("Total Pengecekan Tarif: Rp. "+total);
            System.out.println("-----------------------------------");

            menu();
        }else {
            break outer;
        }
    }

    public static void main(String[] args) {

        // fikril_Ha
        judul();

	    outer:
         while (ulang){
		menu();
            // bayar per jarak
            int hargaPerJarak = (int) jarak(inputPengirim(), inputPenerima());
            System.out.println("Harga Berdasarkan Jarak: Rp. " + hargaPerJarak);
			
            // put
            tampilBarang();
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih Jenis Barang: ");
            int jenis = input.nextInt() - 1;

            input.nextLine();
            System.out.print("Nama Barang: ");
            String namaBarang = input.nextLine();
            System.out.print("Berat Barang (kg): ");
            double berat = input.nextDouble();
            input.nextLine();

            System.out.print("Jumlah Barang: ");
            int jml = input.nextInt();
            input.nextLine();
            System.out.print("Tambah Catatan/Keterangan: ");
            String ket = input.nextLine();

            // bayar per berat dan jumlah
            int hargaPerBerat = (int) menghitungHargaBarangPerBerat(berat, jml);
            System.out.println("Harga Berdasarkan Berat Barang: Rp. " + hargaPerBerat);

            // laila
            Scanner sc = new Scanner(System.in);
            tampilLayanan();
            System.out.print("Masukkan Pilihan Layanan: ");
            int layanan = sc.nextInt() - 1;
            System.out.println("Harga: Rp. " + hargaLayanan[layanan]);
            tampilPacking();
            System.out.print("Masukkan Pilihan Packing: ");
            int pack = sc.nextInt() - 1;
            System.out.println("Harga: Rp. " + hargaPacking[pack]);

            //bayar
            System.out.println("\n------- Pilihan Pembayaran -------");
            String in = "0";
            String kembalian = "Belum Dipilih";
            System.out.println("1. Tunai");
            System.out.println("2. Debit");
            System.out.println("3. Kredit");
            System.out.println("4. COD");
            System.out.println("5. E-Wallet");
            sc.nextLine();
            System.out.print("Masukkan Jenis Pembayaran: ");
            in = sc.nextLine();
            switch (in){
                case "1" :
                    kembalian = "Tunai";
                    break;
                case "2" :
                    kembalian = "Debit";
                    break;
                case "3" :
                    kembalian = "Kredit";
                    break;
                case "4" :
                    kembalian = "Cash On Delivery";
                    break;
                case "5" :
                    System.out.println("Pilih Jenis E-wallet: ");
                    System.out.println("1. LinkAja");
                    System.out.println("2. Ovo");
                    System.out.println("3. Gopay");
                    System.out.print("Masukkan Pilihan: ");
                    String pil = sc.nextLine();
                    switch (pil){
                        case "1" :
                            kembalian = "LinkAja";
                            break;
                        case "2" :
                            kembalian = "Ovo";
                            break;
                        case "3" :
                            kembalian = "Gopay";
                            break;
                    }
            }
			
            System.out.println("Anda Memilih Pembayaran Dengan " + kembalian);
	    int total = hargaPerJarak + hargaPerBerat + hargaLayanan[layanan] + hargaPacking[pack];
            System.out.println("---------------------------------------");
            System.out.println("Total Pembayaran: Rp. "+total);
	    System.out.println("---------------------------------------");
            menampilkanOutput(resi(), namaCustom, jenis, namaBarang, berat, jml, total, kembalian, layanan, ket);

            System.out.print("\nApakah Anda Ingin Melakukan Pengiriman Lagi? (Iya/Tidak): ");
	    String ulangi = input.nextLine();
	    	if(ulangi.equalsIgnoreCase ("y")){
	    	ulang = true; menu();
		} else if(ulangi.equalsIgnoreCase ("ya")){
		ulang = true; menu();
		} else if(ulangi.equalsIgnoreCase ("iya")){
		ulang = true; menu();
		} else {
		ulang = false;
	    }
        }
        System.out.println("\n\t\t\t                 Terima Kasih              ");
        System.out.println("\t\t\tAnda Telah Menggunakan Jasa Ekspedisi Kami :)");
    }
}
