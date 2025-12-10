public class Bill extends BaseEntity {
    private String billType;
    private String billDescription;
    private String billNumber;
    private int billCustomerId;

    public Bill() {}
    public Bill(int id, String billType, String billDescription, String billNumber, int billCustomerId) {
        super(id);
        this.billType = billType;
        this.billDescription = billDescription;
        this.billNumber = billNumber;
        this.billCustomerId = billCustomerId;
    }

    @Override
    public String toString() {
        return "Bill{id=" + id + ", number='" + billNumber + "', type='" + billType + "', customerId=" + billCustomerId + "}";
    }
}
