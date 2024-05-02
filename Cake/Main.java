package Cake;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];
        kueArray[0] = new KueJadi("Bolu", 50000, 1);
        kueArray[1] = new KueJadi("Donat", 30000, 1);
        kueArray[2] = new KueJadi("Brownies", 40000, 1);
        kueArray[3] = new KueJadi("Kue Sus", 35000, 1);
        kueArray[4] = new KueJadi("Kue Lumpur", 60000, 1);
        kueArray[5] = new KueJadi("Kue Lapis", 45000, 1);
        kueArray[6] = new KueJadi("Kue Cubit", 25000, 1);
        kueArray[7] = new KueJadi("Martabak Manis", 20000, 1);
        kueArray[8] = new KueJadi("Pukis", 30000, 1);
        kueArray[9] = new KueJadi("Lumpia", 15000, 1);

        kueArray[10] = new KuePesanan("Kue Ultah", 120000, 1);
        kueArray[11] = new KuePesanan("Rainbow Cake", 200000, 1);
        kueArray[12] = new KuePesanan("Black Forest", 150000, 1);
        kueArray[13] = new KuePesanan("Puding", 80000, 1);
        kueArray[14] = new KuePesanan("Tart", 100000, 1);
        kueArray[15] = new KuePesanan("Roll Cake", 90000, 1);
        kueArray[16] = new KuePesanan("Opera Cake", 180000, 1);
        kueArray[17] = new KuePesanan("Chiffon Cake", 70000, 1);
        kueArray[18] = new KuePesanan("Kue Pancong", 150000, 1);
        kueArray[19] = new KuePesanan("Kue Ape", 80000, 1);

        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.println("=============== DAFTAR KUE ===============");
        for (Kue kue : kueArray) {
            String jenis = (kue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            System.out.println("Nama kue   : " + kue.getNama());
            System.out.println("Harga      : Rp " + df.format(kue.getHarga()));
            System.out.println("Jenis Kue  : " + jenis + "\n");
        }

        double totalHargaSemuaKue = 0;
        double totalHargaKuePesan = 0;
        double totalBeratKuePesan = 0;
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        double hargaTertinggi = 0;
        String jenisKueTertinggi = " ";
        String namaKueTertinggi = " ";

        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesan += kue.hitungHarga();
                totalBeratKuePesan += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }

            totalHargaSemuaKue += kue.hitungHarga();

            if (kue.getHarga() > hargaTertinggi) {
                hargaTertinggi = kue.getHarga();
                namaKueTertinggi = kue.getNama();
                jenisKueTertinggi = (kue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            }
        }

        System.out.println("=================[S T A T S]====================");
        System.out.println("TOTAL HARGA SEMUA KUE        : Rp." + df.format(totalHargaSemuaKue));
        System.out.println("TOTAL HARGA KUE PESANAN      : Rp." + df.format(totalHargaKuePesan));
        System.out.println("TOTAL BERAT KUE PESANAN      : " + df.format(totalBeratKuePesan) + " gram");
        System.out.println("TOTAL HARGA KUE JADI         : Rp." + df.format(totalHargaKueJadi));
        System.out.println("TOTAL JUMLAH KUE JADI        : " + df.format(totalJumlahKueJadi) + " buah");
        System.out.println("\nKUE DENGAN HARGA TERTINGGI");
        System.out.println("  Berdasarkan jenis    : " + jenisKueTertinggi);
        System.out.println("  Berdasarkan nama kue : " + namaKueTertinggi);
    }
}
