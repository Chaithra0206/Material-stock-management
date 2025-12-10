import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Material Stock Management System Running...");
        Scanner sc = new Scanner(System.in);
        DataStore store = new DataStore();

        // seed some data
        store.addStock("Steel Rod", "ST-001", "Raw Material", "6m rods");
        store.addStock("Bearing", "BR-010", "Spare", "Ball bearings");
        store.addCustomer("ABC Pvt Ltd", "9876543210", "abc@ex.com", "123 Street", "abcuser", "pass");
        store.addProduct(1, "PR-100", "Nut & Bolt Set", "Finished", "Fasteners");

        while (true) {
            System.out.println("\n==== MATERIAL STOCK MANAGEMENT ====");
            System.out.println("1. Add Stock");
            System.out.println("2. View Stocks");
            System.out.println("3. Delete Stock");
            System.out.println("4. View Customers");
            System.out.println("5. Add Product");
            System.out.println("6. View Products");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = -1;
            try {
                ch = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) { System.out.println("Invalid input"); continue; }

            switch (ch) {
                case 1:
                    System.out.print("Item name: ");
                    String name = sc.nextLine();
                    System.out.print("Number/code: ");
                    String number = sc.nextLine();
                    System.out.print("Type: ");
                    String type = sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    Stock added = store.addStock(name, number, type, desc);
                    System.out.println("Added: " + added);
                    break;
                case 2:
                    List<Stock> stocks = store.allStocks();
                    System.out.println("=== STOCKS ===");
                    for (Stock s : stocks) System.out.println(s);
                    break;
                case 3:
                    System.out.print("Enter Stock ID to delete: ");
                    int did = Integer.parseInt(sc.nextLine().trim());
                    boolean ok = store.deleteStock(did);
                    System.out.println(ok ? "Deleted." : "Not found.");
                    break;
                case 4:
                    System.out.println("=== CUSTOMERS ===");
                    for (Customer c : store.allCustomers()) System.out.println(c);
                    break;
                case 5:
                    System.out.print("Customer ID for product: ");
                    int cid = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Product number: ");
                    String pnum = sc.nextLine();
                    System.out.print("Product items: ");
                    String pitems = sc.nextLine();
                    System.out.print("Product type: ");
                    String ptype = sc.nextLine();
                    System.out.print("Description: ");
                    String pdesc = sc.nextLine();
                    Product p = store.addProduct(cid, pnum, pitems, ptype, pdesc);
                    System.out.println("Added product: " + p);
                    break;
                case 6:
                    System.out.println("=== PRODUCTS ===");
                    for (Product pr : store.allProducts()) System.out.println(pr);
                    break;
                case 7:
                    System.out.println("Exiting. Bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
