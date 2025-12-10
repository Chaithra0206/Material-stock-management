public class Stock extends InventoryItem {
    private String stockItems;
    private String stockNumber;
    private String stockType;

    public Stock() {}
    public Stock(int id, String stockItems, String stockNumber, String stockType, String description) {
        super(id, description);
        this.stockItems = stockItems;
        this.stockNumber = stockNumber;
        this.stockType = stockType;
    }

    public String getStockItems() { return stockItems; }
    public String getStockNumber() { return stockNumber; }
    public String getStockType() { return stockType; }

    @Override
    public String toString() {
        return "Stock{id=" + id + ", items='" + stockItems + "', number='" + stockNumber + "', type='" + stockType + "'}";
    }
}
