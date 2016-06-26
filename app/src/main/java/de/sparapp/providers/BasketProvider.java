package de.sparapp.providers;

import java.util.ArrayList;
import java.util.List;

import de.sparapp.entities.Product;
import de.sparapp.entities.ProductInBasket;

public class BasketProvider {
    private static List<ProductInBasket> products = new ArrayList<>();

    public static List<ProductInBasket> getProducts() {
        return products;
    }

    public static void addProduct(Product product) {
        for(ProductInBasket productInBasket : products) {
            if(productInBasket.getProduct().equals(product)) {
                productInBasket.setAmount(productInBasket.getAmount() + 1);
                return;
            }
        }

        products.add(new ProductInBasket(product, 1));
    }

    public static int getTotal() {
        int i = 0;
        for(ProductInBasket productInBasket : products) {
            i =+ productInBasket.getAmount();
        }

        return i;
    }
}
