package Pekerjaan;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, jenisKelamin, nik, menikah);
        this.departemen = departemen;
    }
    
    public String toString() {
        return super.toString() + "\ndepartemen : " + departemen;
    }
}
