package arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1.5, 25.99, 101));
        products.add(new Product(2.0, 19.99, 102));
        products.add(new Product(0.5, 9.99, 103));
        products.add(new Product(1.0, 15.49, 104));

        Collections.sort(products);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
