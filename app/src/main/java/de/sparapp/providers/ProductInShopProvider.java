package de.sparapp.providers;

import java.util.ArrayList;
import java.util.List;

import de.sparapp.entities.Product;
import de.sparapp.entities.ProductInShop;
import de.sparapp.entities.Shop;

public class ProductInShopProvider {
    private static List<ProductInShop> productsInShops;

    private static void init() {
        if(productsInShops == null) {
            productsInShops = new ArrayList<>();

            productsInShops.add(new ProductInShop(1, ProductProvider.getProductById(1), ShopProvider.getShopByName("Aldi"), 5.0));
            productsInShops.add(new ProductInShop(2, ProductProvider.getProductById(2), ShopProvider.getShopByName("Aldi"), 10.0));
            productsInShops.add(new ProductInShop(3, ProductProvider.getProductById(1), ShopProvider.getShopByName("Walmart"), 2.0));
            productsInShops.add(new ProductInShop(4, ProductProvider.getProductById(2), ShopProvider.getShopByName("Walmart"), 5.0));
        }
    }

    public static List<ProductInShop> getProductsInShops() {
        init();

        return productsInShops;
    }

    public static List<ProductInShop> getProductsForShop(Shop shop) {
        init();

        ArrayList<ProductInShop> products = new ArrayList<>();

        for(ProductInShop product : productsInShops) {
            if(product.getShop().getId() == shop.getId()) {
                products.add(product);
            }
        }

        return products;
    }

    public static ProductInShop getProduct(Shop shop, Product product) {
        init();

        for(ProductInShop productInShop : productsInShops) {
            if(productInShop.getShop().getId() == shop.getId() && productInShop.getProduct().getId() == product.getId()) {
                return productInShop;
            }
        }

        return null;
    }
}
