package session16.TestFistHour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository implements IRepository<Product>{
    ArrayList<Product> arrayListProduct =new ArrayList<>();
    HashMap<String, Product> hashMapProduct = new HashMap<>();

    @Override
    public boolean add(Product item) {
        arrayListProduct.add(item);
        hashMapProduct.put(item.getId(), item);
        System.out.println("Them thanh cong: "+ item.getName());
        return true;
    }

    @Override
    public boolean removeById(String id) {
        Product product = findById(id);
        if (product != null){
            arrayListProduct.remove(id);
            System.out.println("Da xoa thanh cong");
            return true;
        }
        System.out.println("Khong tim thay san pham");
        return  false;
    }

    @Override
    public Product findById(String id) {
       return  hashMapProduct.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(hashMapProduct.values());
    }
}
