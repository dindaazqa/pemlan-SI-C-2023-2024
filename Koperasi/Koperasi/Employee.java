package Koperasi;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private List<Invoice> invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new ArrayList<>();
    }

    @Override
    public double getPayableAmount() {
        double totalInvoicesAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoicesAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoicesAmount;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTotal Belanja")
                .append("\nID = ").append(registrationNumber)
                .append("\nNama = ").append(name).append("")
                .append("\nGaji = ").append(salaryPerMonth)
                .append("\nSisa Gaji = ").append(getPayableAmount());
        for (Invoice invoice : invoices) {
            sb.append("\n  ").append(invoice);
        }
        sb.append("\n");
        return sb.toString();
    }
}
