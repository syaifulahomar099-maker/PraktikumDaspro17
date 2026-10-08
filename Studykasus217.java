import java.util.Scanner;

public class Studykasus217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaanPKM;

        System.out.println("=== VALIDASI DOKUMEN PRESTASI MAHASISWA ===");

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen yang diupload (0-4): ");
        jumlahDokumen = input.nextInt();

        System.out.print("Peringkat juara (1, 2, 3, atau 0 jika bukan juara): ");
        peringkatJuara = input.nextInt();

        System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
        statusPendanaanPKM = input.nextInt();

        System.out.println("\n=== HASIL VALIDASI ===");
        System.out.println("Nama mahasiswa : " + namaMahasiswa);
        System.out.println("Jenis kegiatan : " + jenisKegiatan);

        
        if (jumlahDokumen < 4) {
            int kurang = 4 - jumlahDokumen;

            System.out.println("Status dokumen : Tidak lengkap");
            System.out.println("Dokumen kurang : " + kurang + " dokumen");
            System.out.println("Penghargaan    : Tidak diberikan");

        } else {

            System.out.println("Status dokumen : Lengkap");

            
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                    || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                    || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

                if (peringkatJuara == 1
                        || peringkatJuara == 2
                        || peringkatJuara == 3) {

                    System.out.println("Peringkat      : Juara " + peringkatJuara);
                    System.out.println("Penghargaan    : DIBERIKAN");

                } else {
                    System.out.println("Peringkat      : Bukan juara");
                    System.out.println("Penghargaan    : Tidak diberikan");
                }

            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            
                if (statusPendanaanPKM == 1) {
                    System.out.println("Pendanaan PKM  : Lolos");
                    System.out.println("Penghargaan    : DIBERIKAN");

                } else {
                    System.out.println("Pendanaan PKM  : Tidak lolos");
                    System.out.println("Penghargaan    : Tidak diberikan");
                }

            } else {

                System.out.println("Jenis kegiatan : Lainnya");
                System.out.println("Penghargaan    : Tidak diberikan");
            }
        }

        input.close();
    }
}