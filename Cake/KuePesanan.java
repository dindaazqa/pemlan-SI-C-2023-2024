package Cake;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double hitungHarga() {
        return harga * berat;
    }

    public double getBerat() {
        return berat;
    }
}
