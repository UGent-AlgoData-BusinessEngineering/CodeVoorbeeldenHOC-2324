public class Transaction {
    private String productID;
    private double prijs;
    private int hoeveelheid;
    private String beschrijving;

    public Transaction(String productID, double prijs, int hoeveelheid, String beschrijving) {
        this.productID = productID;
        this.prijs = prijs;
        this.hoeveelheid = hoeveelheid;
        this.beschrijving = beschrijving;
    }

    @Override
    public String toString() {
        return String.format("%d stuks verkocht van product %s (productID: %s) aan €%1.2f stuk.",hoeveelheid, beschrijving, productID, prijs);
    }
}
