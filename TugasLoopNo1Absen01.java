import java.util.Scanner;

public class TugasLoopNo1Absen01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jmlTiket, h = 50000, totalTiket=0;
    double harga, totalHarga=0;

    do {
      System.out.println("masukkan jumlah tiket (ketik 0 untuk keluar)");
      jmlTiket = sc.nextInt();
      if (jmlTiket < 0) {
        System.out.println("tidak valid");
        continue;
      }
      if (jmlTiket == 0) {
        break;
      }
      if (jmlTiket > 0 && jmlTiket <= 4) {
        harga = jmlTiket * h;
      } else if (jmlTiket > 4 && jmlTiket <= 10) {
        harga = jmlTiket * 0.9 * h;
      } else {
        harga = jmlTiket * 0.85 * h;
      }
      totalHarga += harga;
      totalTiket += jmlTiket;
      System.out.println("harga untuk " + jmlTiket + "tiket: Rp" + harga);
      System.out.println("Total tiket dan harga adalah" + " "+ totalTiket +" "+ totalHarga);
      sc.nextLine();
    } while (true);
    System.out.println("program selesai");
  }
}
