public class Customer extends BaseEntity {
    private String customerName;
    private String customerMobile;
    private String customerEmail;
    private String customerAddress;
    private String customerUsername;
    private String customerPassword;

    public Customer() {}
    public Customer(int id, String customerName, String customerMobile, String customerEmail, String customerAddress, String customerUsername, String customerPassword) {
        super(id);
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerUsername = customerUsername;
        this.customerPassword = customerPassword;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + customerName + "', mobile='" + customerMobile + "'}";
    }
}
