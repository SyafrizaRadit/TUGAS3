import java.util.Scanner;

/**
 * Kelas Converter adalah program sederhana untuk mengonversi panjang dari
 * centimeter (cm) ke kilometer (km).
 */
public class Main {

    /**
     * Metode utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang dalam centimeter
        System.out.print("Masukkan panjang dalam centimeter: ");
        double cm = input.nextDouble();

        // Menghitung kilometer (1 km = 100000 cm)
        double km = cmToKm(cm);

        // Menampilkan hasil konversi
        System.out.println("Panjang dalam kilometer: " + km + " km");

        input.close();
    }

    /**
     * Metode ini mengonversi panjang dari centimeter (cm) ke kilometer (km).
     *
     * @param cm Panjang dalam centimeter.
     * @return Panjang dalam kilometer.
     */
    public static double cmToKm(double cm) {
        return cm / 100000.0;
    }
}
