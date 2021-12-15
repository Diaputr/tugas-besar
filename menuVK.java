public static void menuVK() {
    System.out.println("\n------- MENU -------");
    System.out.println("1. Mengirim Paket");
    System.out.println("2. Daftar Harga");
    System.out.println("3. Cek Tarif Pengiriman");
    System.out.println("4. Keluar");
    System.out.print("Pilih Menu: ");
    int pil = pb.nextInt();
    switch (pil) {
        case 1:
            System.out.println();
            System.out.println("\n------- Pengiriman Paket -------");
            break;
        case 2:
            System.out.println("\n------- Daftar Harga -------");
            System.out.println("A) Harga Berat");
            System.out.println("1. <5 kg = Rp. 5000");
            System.out.println("2. 5 - 10 kg = Rp. 10000");
            System.out.println(">3. 10 kg = Rp. 15000");
            System.out.println("\nB) Harga Layanan");
            System.out.println("1. Reguler = Rp. 7000");
            System.out.println("2. Kilat = Rp. 10000");
            System.out.println("3. Ekonomis = Rp. 4000");
            System.out.println("Special Service = Rp. 15000");
            System.out.println("\nC) Harga Packing");
            System.out.println("1. Kardus = Rp. 3000");
            System.out.println("2. Kayu = Rp. 15000");
            menu();
            break;
        case 3:
            System.out.println("\n------- Cek Tarif Pengiriman -------");
            tampilinBagus();
            System.out.print("\nDaerah Asal: ");
            int asal = pb.nextInt() - 1;
            System.out.print("Daerah Tujuan: ");
            int tujuan = pb.nextInt() - 1;
            int harga = (int) jarak(asal,tujuan); 
            System.out.println("\n-------- Informasi Barang --------");
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
            System.out.println("Total Tarif: Rp. " + total );
            System.out.println("-----------------------------------");
            menu();
            break;
        case 4:
            System.out.println("Terima kasih telah menggunakan jasa kami :)");
            break outer;
        default:
            break;
    }
}