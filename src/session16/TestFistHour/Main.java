package session16.TestFistHour;

import java.util.*;

public class Main {
    static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        repo = new ProductRepository();


        repo.add(new ElectronicProduct("E01", "Laptop", 2000, 24));
        repo.add(new ElectronicProduct("E02", "Mouse", 500, 6));
        repo.add(new FoodProduct("F01", "Milk", 30000, 10));
        repo.add(new FoodProduct("F02", "Cake", 50000, 20));


        System.out.println("Danh sach san pham");

        List<Product> products = repo.findAll();
        for (Product p : products) {
            p.displayInfo();
            System.out.println("Thanh tien: " + p.calculateFinalPrice());
            System.out.println("---------------------");
        }

        System.out.println("Tim san pham (theo id): ");
        String searchId = "E01";
        Product found = repo.findById(searchId);
        if (found != null) {
            found.displayInfo();
            System.out.println("Thanh tien: " + found.calculateFinalPrice());
        } else {
            System.out.println("Khong tim thay san pham!");
        }

        System.out.println("Xap xep san pham tang dan");
        Collections.sort(products, Comparator.comparing(Product::getPrice));
        for (Product p : products) {
            p.displayInfo();
        }

        System.out.println("Thong ke");
        Map<String, Integer> statistics = new HashMap<>();
        for (Product p : products) {
            String type;
            if (p instanceof ElectronicProduct) {
                type = "Electronic";
            } else if (p instanceof FoodProduct) {
                type = "Food";
            } else {
                type = "Other";
            }
            statistics.put(type, statistics.getOrDefault(type, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
