public class Product extends InventoryItem {
    private int productCustomerId;
    private String productNumber;
    private String productItems;
    private String productType;

    public Product() {}
    public Product(int id, int productCustomerId, String productNumber, String productItems, String productType, String description) {
        super(id, description);
        this.productCustomerId = productCustomerId;
        this.productNumber = productNumber;
        this.productItems = productItems;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", items='" + productItems + "', number='" + productNumber + "', custId=" + productCustomerId + "}";
    }
}
