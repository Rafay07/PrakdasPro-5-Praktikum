import java.util.Scanner;

public class  PemilihanBilanganNoAbsen2Modif{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Masukkan Sebuah Angka: ");
        int angka=sc.nextInt();
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Bilangan Tersebut adalah bilangan " + hasil );
sc.close();
    }
}
