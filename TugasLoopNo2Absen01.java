import java.util.Scanner;
public class TugasLoopNo2Absen01 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int jenis, durasi, total=0, harga=0;

    do {
      System.out.println("masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
      jenis=sc.nextInt();

      if (jenis==1) {
        System.out.println("masukkan lama parkir");
        durasi=sc.nextInt();
        if (durasi>5) {
          harga=12500;
          System.out.println("harga yang harus dibayar adalah Rp."+ harga);
        }else if (durasi >0 && durasi<=5) {
          harga=durasi * 3000;
          System.out.println("harga yang harus dibayar adalah Rp."+ harga);
        }
      }else if (jenis==2) {
        System.out.println("masukkan lama parkir");
        durasi=sc.nextInt();
        if (durasi>5) {
          harga=12500;
          System.out.println("harga yang harus dibayar adalah Rp."+ harga);
        }else if (durasi >0 && durasi<=5) {
          harga=durasi * 2000;
          System.out.println("harga yang harus dibayar adalah Rp."+ harga);
        }
      }else if(jenis==0){
        break;
      }else{
        System.out.println("Jenis Jenis kendaraan tidak dikenali");
      }
      total+=harga;
    } while (true);
    System.out.println("total tarif parkir adalah: Rp."+total);
    System.out.println("program selesai");
    sc.nextLine();
  }
}
