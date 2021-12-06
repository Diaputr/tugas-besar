import java.util.Scanner;
public class mulai {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jenis barang: ");
    System.out.print("Masukkan berat barang: "+"kg");
    int input = sc.nextInt();
    
    System.out.println("==================== Program Ekspedisi ====================");
    System.out.println("=================== Provinsi Jawa Timur ===================");
    System.out.println("Jenis Ekspedisi ");
    System.out.println("[1] -> Paket Reguler");
    System.out.println("[2] -> Paket Kilat");
    System.out.println("[3] -> Paket Kontainer");
    System.out.print("Masukkan Pilihan Anda: ");
    int input = sc.nextInt();
            int tarifPerkilo = 0;
        switch (input) {
            case (1) :
                tarifPerkilo = 5000;
            break;
            case (2) :
                tarifPerkilo = 2000;
            break;
            case (3) :
                tarifPerkilo = 3000;
            break;
            default :
		System.out.println("Jenis Packaging ");
    System.out.println("[1] -> Plastik");
    System.out.println("[2] -> Kardus);
    System.out.print("Masukkan Pilihan Anda: ");
    int input = sc.nextInt();
  }
}
