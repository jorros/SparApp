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
            products.add(new Product(2, "Fanta Orange 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(3, "Wasser 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(4, "Apfelschorle 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(5, "H-Milch 1,5% Fett", "", CategoryProvider.getCategoryByName("Milch")));
            products.add(new Product(6, "H-Milch 3,5% Fett", "", CategoryProvider.getCategoryByName("Milch")));
            products.add(new Product(7, "Frischmilch", "", CategoryProvider.getCategoryByName("Milch")));
            products.add(new Product(8, "Soja Milch", "", CategoryProvider.getCategoryByName("Milch")));
            products.add(new Product(9, "Stieleis", "", CategoryProvider.getCategoryByName("Eiscreme")));
            products.add(new Product(10, "Vanille Eis", "", CategoryProvider.getCategoryByName("Eiscreme")));
            products.add(new Product(11, "Wassereis", "", CategoryProvider.getCategoryByName("Eiscreme")));
            products.add(new Product(12, "Waffeleis", "", CategoryProvider.getCategoryByName("Eiscreme")));
            products.add(new Product(13, "Aufbackbrötchen", "", CategoryProvider.getCategoryByName("Brot & Backwaren")));
            products.add(new Product(14, "Toast", "", CategoryProvider.getCategoryByName("Brot & Backwaren")));
            products.add(new Product(15, "Schwarzbrot", "", CategoryProvider.getCategoryByName("Brot & Backwaren")));
            products.add(new Product(16, "Vollkornbrot", "", CategoryProvider.getCategoryByName("Brot & Backwaren")));
            products.add(new Product(17, "Kartoffel Chips", "", CategoryProvider.getCategoryByName("Süßigkeiten & Snacks")));
            products.add(new Product(18, "Erdnüsse", "", CategoryProvider.getCategoryByName("Süßigkeiten & Snacks")));
            products.add(new Product(19, "Kekse", "", CategoryProvider.getCategoryByName("Süßigkeiten & Snacks")));
            products.add(new Product(20, "Pralinen", "", CategoryProvider.getCategoryByName("Süßigkeiten & Snacks")));
            products.add(new Product(21, "Schoko Riegel", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(22, "Wasser still", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(23, "Wasser Medium", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(24, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(25, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(26, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(27, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(27, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(28, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(29, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(30, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(31, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(32, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(33, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(34, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(35, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(36, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(37, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(38, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(39, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(40, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(41, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(42, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(43, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(44, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(45, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(46, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(47, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(48, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(49, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(50, "Coca-Cola 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));





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
