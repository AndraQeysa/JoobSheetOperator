import java.util.Scanner;
public class Celcius {
    public static void main (String[] agrs){
         // Deklarasi
    Double C, F;
    
    // Membuat Scanner Baru
    Scanner Suhu = new Scanner (System.in);
    
    // Input
    System.out.println ("===== Program Konversi Suhu C Ke F =====");
    System.out.print ("Input C");
    C = Suhu.nextDouble ();
    
    // Proses
    F = Double.valueOf ((9 * C / 5) + 32);
    
    // Output
    System.out.println ("F = " + F );
    }
}
