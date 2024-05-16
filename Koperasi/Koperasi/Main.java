package Koperasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Employee loggedInEmployee = null;
    private static Scanner scanner = new Scanner(System.in);
    private static final List<Invoice> invoices = new ArrayList<>();

    public static void main(String[] args) {
        initializeInvoices();
        while (true) {
            printMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    if (loggedInEmployee != null) {
                        shop();
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 3:
                    if (loggedInEmployee != null) {
                        viewShoppingDetails();
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void initializeInvoices() {
        invoices.add(new Invoice("Air Mineral -- ", 3500, 0));
        invoices.add(new Invoice("Mie Instan -- ", 3000, 0));
        invoices.add(new Invoice("Minyak -- ", 25000, 0));
        invoices.add(new Invoice("Tepung -- ", 8000, 0));
        invoices.add(new Invoice("Saus -- ", 15000, 0));
        invoices.add(new Invoice("Beras -- ", 65000, 0));
        invoices.add(new Invoice("Gula -- ", 17000, 0));
        invoices.add(new Invoice("Kapas -- ", 20000, 0));
        invoices.add(new Invoice("Melon -- ", 29000, 0));
        invoices.add(new Invoice("Apel -- ", 80000, 0));
        invoices.add(new Invoice("Permen -- ", 170000, 0));
        invoices.add(new Invoice("Ayam Segar -- ", 450000, 0));
        invoices.add(new Invoice("Sabun -- ", 150000, 0));
    }

    private static void printMainMenu() {
        System.out.println("\n========[KOPERASI KARYAWAN]========");
        System.out.println("Pilihan Program:");
        System.out.println("1. Masuk");
        System.out.println("2. Belanja");
        System.out.println("3. Lihat Detail Belanja");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private static void login() {
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan nomor registrasi pegawai: ");
        int registrationNumber = scanner.nextInt();
        System.out.print("Masukkan jumlah gaji per bulan: ");
        int salaryPerMonth = scanner.nextInt();
        scanner.nextLine();  
        loggedInEmployee = new Employee(registrationNumber, name, salaryPerMonth);
        System.out.println("USERINFO: Berhasil login!");
    }

    private static void shop() {
        while (true) {
            System.out.println("\nDaftar Produk:");
            for (int i = 0; i < invoices.size(); i++) {
                Invoice invoice = invoices.get(i);
                System.out.println((i + 1) + ". " + invoice.getProductName() + " Rp " + invoice.getPricePerItem());
            }
            System.out.println((invoices.size() + 1) + ". Selesai belanja");
            System.out.print("Masukkan pilihan produk: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == invoices.size() + 1) {
                break;
            } else if (choice > 0 && choice <= invoices.size()) {
                Invoice selectedInvoice = invoices.get(choice - 1);
                System.out.print("Masukkan kuantitas: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();  
                Invoice newInvoice = new Invoice(selectedInvoice.getProductName(), quantity, selectedInvoice.getPricePerItem());
                loggedInEmployee.addInvoice(newInvoice);
                System.out.println("Produk berhasil ditambahkan ke keranjang!");
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    private static void viewShoppingDetails() {
        System.out.println(loggedInEmployee);
    }
}
