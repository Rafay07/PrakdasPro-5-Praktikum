import java.util.Scanner;

public class SIAKADNoAbsen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        
        System.out.print("Masukkan kelas: ");
        String kelas = sc.nextLine();
        
        System.out.print("Masukkan nomor absen: ");
        int nomorAbsen = sc.nextInt();
        
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = sc.nextDouble();
        
        double nilaiAkhir = (0.3 * nilaiKuis) + (0.4 * nilaiTugas) + (0.3 * nilaiUjian);
        
        String nilaiHuruf;
        String kualifikasi;
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }
        
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + nomorAbsen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        
        sc.close();
    }
}