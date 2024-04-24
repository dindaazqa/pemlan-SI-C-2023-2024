package Pekerjaan;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Testcase Manusia
        Manusia manusiaA = new Manusia("A", true, "111", true);
        System.out.println(manusiaA);
        System.out.println();

        // Testcase MahasiswaFILKOM
        MahasiswaFILKOM mahasiswaFilkomB = new MahasiswaFILKOM("165150300111100", 4.0, "B", false, "111", false);
        System.out.println(mahasiswaFilkomB);
        System.out.println();

        // Testcase Pekerja
        Pekerja pekerjaC = new Pekerja(1000, LocalDate.of(2016, 3, 2), 4, "C", true, "111", true);
        System.out.println(pekerjaC);
        System.out.println();

        // Testcase Manager
        Manager managerD = new Manager("HRD", 1000, LocalDate.of(2017, 1, 2), 3, "D", true, "111", true);
        System.out.println(managerD);
    }
}

