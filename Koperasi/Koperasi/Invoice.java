package Koperasi;

public class Invoice implements Payable {
    private final String productName;
    private int quantity = 0;
    private final int pricePerItem;

    public Invoice(String productName, int pricePerItem, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString() {
        return "\nNama Produk : " + productName + 
                "\nJumlah : " + quantity +
                "\nHarga per Item : " + pricePerItem +
                "\nTotal : " + getPayableAmount();
    }
}
