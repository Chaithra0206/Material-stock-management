import java.util.*;

public class DataStore {
    // simple in-memory store
    public List<Role> roles = new ArrayList<>();
    public List<Permission> permissions = new ArrayList<>();
    public List<User> users = new ArrayList<>();
    public List<Customer> customers = new ArrayList<>();
    public List<Stock> stocks = new ArrayList<>();
    public List<Product> products = new ArrayList<>();
    public List<Store> stores = new ArrayList<>();
    public List<Bill> bills = new ArrayList<>();

    private Map<Class<?>, Integer> idCounters = new HashMap<>();

    public DataStore() {
        // init counters
        idCounters.put(Role.class, 0);
        idCounters.put(Permission.class, 0);
        idCounters.put(User.class, 0);
        idCounters.put(Customer.class, 0);
        idCounters.put(Stock.class, 0);
        idCounters.put(Product.class, 0);
        idCounters.put(Store.class, 0);
        idCounters.put(Bill.class, 0);
    }

    private int nextId(Class<?> cls) {
        int v = idCounters.getOrDefault(cls, 0) + 1;
        idCounters.put(cls, v);
        return v;
    }

    // example helpers for Stock
    public Stock addStock(String items, String number, String type, String desc) {
        Stock s = new Stock(nextId(Stock.class), items, number, type, desc);
        stocks.add(s);
        return s;
    }

    public boolean deleteStock(int id) {
        return stocks.removeIf(s -> s.getId() == id);
    }

    public Stock findStock(int id) {
        for (Stock s : stocks) if (s.getId() == id) return s;
        return null;
    }

    public List<Stock> allStocks() { return stocks; }

    // customer helper
    public Customer addCustomer(String name, String mobile, String email, String address, String uname, String pwd) {
        Customer c = new Customer(nextId(Customer.class), name, mobile, email, address, uname, pwd);
        customers.add(c);
        return c;
    }

    public List<Customer> allCustomers() { return customers; }

    // product helper
    public Product addProduct(int custId, String number, String items, String type, String desc) {
        Product p = new Product(nextId(Product.class), custId, number, items, type, desc);
        products.add(p);
        return p;
    }

    public List<Product> allProducts() { return products; }
}
