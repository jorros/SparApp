package de.sparapp.providers;

import java.util.ArrayList;
import java.util.List;

import de.sparapp.entities.Product;

public class ProductProvider {
    private static List<Product> products;

    private static void init() {
        if(products == null) {
            products = new ArrayList<>();

            products.add(new Product(1, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
        }
    }

    public static List<Product> getProducts() {
        init();

        return products;
    }

    public static Product getProductById(int id) {
        init();

        for(Product product : products)
        {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }
}
