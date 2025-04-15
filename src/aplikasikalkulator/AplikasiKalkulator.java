package aplikasikalkulator;

import java.util.Scanner;

/**
 * Aplikasi Kalkulator Canggih dan Modern
 * @author Richa
 */
public class AplikasiKalkulator {

    // Scanner untuk input dari pengguna
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metode utama yang menjalankan aplikasi
     * @param args parameter command-line (tidak digunakan)
     */
    public static void main(String[] args) {
        boolean keluar = false;

        while (!keluar) {
            tampilkanMenu();
            int pilihan = bacaInputInteger("Pilih operasi: ");

            switch (pilihan) {
                case 1:
                    tambah();
                    break;
                case 2:
                    kurang();
                    break;
                case 3:
                    kali();
                    break;
                case 4:
                    bagi();
                    break;
                case 5:
                    pangkat();
                    break;
                case 6:
                    akarKuadrat();
                    break;
                case 7:
                    logaritma();
                    break;
                case 0:
                    keluar = true;
                    System.out.println("Terima kasih telah menggunakan aplikasi kalkulator!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println(); // Baris kosong untuk pemisah
        }
    }

    /**
     * Menampilkan menu operasi kalkulator
     */
    private static void tampilkanMenu() {
        System.out.println("=== APLIKASI KALKULATOR CANGGIH ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Pangkat");
        System.out.println("6. Akar Kuadrat");
        System.out.println("7. Logaritma");
        System.out.println("0. Keluar");
        System.out.println("===============================");
    }

    /**
     * Menghitung penjumlahan dua bilangan
     */
    private static void tambah() {
        double angka1 = bacaInputDouble("Masukkan angka pertama: ");
        double angka2 = bacaInputDouble("Masukkan angka kedua: ");
        double hasil = angka1 + angka2;
        System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
    }

    /**
     * Menghitung pengurangan dua bilangan
     */
    private static void kurang() {
        double angka1 = bacaInputDouble("Masukkan angka pertama: ");
        double angka2 = bacaInputDouble("Masukkan angka kedua: ");
        double hasil = angka1 - angka2;
        System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
    }

    /**
     * Menghitung perkalian dua bilangan
     */
    private static void kali() {
        double angka1 = bacaInputDouble("Masukkan angka pertama: ");
        double angka2 = bacaInputDouble("Masukkan angka kedua: ");
        double hasil = angka1 * angka2;
        System.out.println("Hasil: " + angka1 + " x " + angka2 + " = " + hasil);
    }

    /**
     * Menghitung pembagian dua bilangan
     */
    private static void bagi() {
        double angka1 = bacaInputDouble("Masukkan angka pertama: ");
        double angka2 = bacaInputDouble("Masukkan angka kedua: ");
        if (angka2 == 0) {
            System.out.println("Pembagian oleh nol tidak diperbolehkan!");
        } else {
            double hasil = angka1 / angka2;
            System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
        }
    }

    /**
     * Menghitung pangkat suatu bilangan
     */
    private static void pangkat() {
        double angka = bacaInputDouble("Masukkan angka: ");
        double eksponen = bacaInputDouble("Masukkan eksponen: ");
        double hasil = Math.pow(angka, eksponen);
        System.out.println("Hasil: " + angka + " ^ " + eksponen + " = " + hasil);
    }

    /**
     * Menghitung akar kuadrat suatu bilangan
     */
    private static void akarKuadrat() {
        double angka = bacaInputDouble("Masukkan angka: ");
        if (angka < 0) {
            System.out.println("Akar kuadrat dari bilangan negatif tidak didefinisikan!");
        } else {
            double hasil = Math.sqrt(angka);
            System.out.println("Hasil: √" + angka + " = " + hasil);
        }
    }

    /**
     * Menghitung logaritma suatu bilangan
     */
    private static void logaritma() {
        double angka = bacaInputDouble("Masukkan angka: ");
        if (angka <= 0) {
            System.out.println("Logaritma dari bilangan non-positif tidak didefinisikan!");
        } else {
            double hasil = Math.log10(angka);
            System.out.println("Hasil: log10(" + angka + ") = " + hasil);
        }
    }

    /**
     * Membaca input integer dari pengguna
     * @param pesan Pesan yang ditampilkan sebelum input
     * @return Nilai integer yang dimasukkan pengguna
     */
    private static int bacaInputInteger(String pesan) {
        System.out.print(pesan);
        return scanner.nextInt();
    }

    /**
     * Membaca input double dari pengguna
     * @param pesan Pesan yang ditampilkan sebelum input
     * @return Nilai double yang dimasukkan pengguna
     */
    private static double bacaInputDouble(String pesan) {
        System.out.print(pesan);
        return scanner.nextDouble();
    }
}