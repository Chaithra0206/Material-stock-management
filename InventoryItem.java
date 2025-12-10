public class InventoryItem extends BaseEntity {
    protected String description;

    public InventoryItem() {}
    public InventoryItem(int id, String description) {
        super(id);
        this.description = description;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
