import java.util.Scanner;
public class Studykasus117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup;
        int uangDibayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, uangKurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangDibayar = scanner.nextInt();
        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
        totalBayar = totalHarga - diskon;

        if (totalHarga >= 100000) {
            diskon = (int) (totalHarga * 0.1);
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }
        if (uangDibayar >= totalBayar) {
            kembalian = uangDibayar - totalBayar;
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: " + totalBayar);
            System.out.println("Uang dibayar: " + uangDibayar);
            System.out.println("Kembalian: " + kembalian);
        } else {
            uangKurang = totalBayar - uangDibayar;
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: " + totalBayar);
            System.out.println("Uang dibayar: " + uangDibayar);
            System.out.println("Uang kurang: " + uangKurang);
        }
        
    }
}