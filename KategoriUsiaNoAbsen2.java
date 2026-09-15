import java.util.Scanner;

public class KategoriUsiaNoAbsen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan usia: ");
        int usia = sc.nextInt();
        
        if (usia >= 65) {
            System.out.println("Kategori: Lansia");
        } else if (usia >= 20) {
            System.out.println("Kategori: Dewasa");
        } else if (usia >= 13) {
            System.out.println("Kategori: Remaja");
        } else if (usia >= 0) {
            System.out.println("Kategori: Anak");
        } else {
            System.out.println("Tidak Valid");
        }
        
        sc.close();
    }
}