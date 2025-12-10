public class Store extends InventoryItem {
    private String storeName;
    private String storeType;

    public Store() {}
    public Store(int id, String storeName, String storeType, String description) {
        super(id, description);
        this.storeName = storeName;
        this.storeType = storeType;
    }

    @Override
    public String toString() {
        return "Store{id=" + id + ", name='" + storeName + "', type='" + storeType + "'}";
    }
}
