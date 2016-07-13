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
            products.add(new Product(3, "Backpapier - Zuschnitte", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(4, "Apfelschorle 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(5, "H-Milch 1,5% Fett 1L", "", CategoryProvider.getCategoryByName("Milch")));
            products.add(new Product(6, "H-Milch 3,5% Fett 1L", "", CategoryProvider.getCategoryByName("Milch")));
            products.add(new Product(7, "Frischmilch 1L", "", CategoryProvider.getCategoryByName("Milch")));
            products.add(new Product(8, "Soja Milch 1L", "", CategoryProvider.getCategoryByName("Milch")));
            products.add(new Product(9, "Stieleis 500ml", "", CategoryProvider.getCategoryByName("Eiscreme")));
            products.add(new Product(10, "Vanille Eis 500ml", "", CategoryProvider.getCategoryByName("Eiscreme")));
            products.add(new Product(11, "Wassereis 500ml", "", CategoryProvider.getCategoryByName("Eiscreme")));
            products.add(new Product(12, "Waffeleis 500ml", "", CategoryProvider.getCategoryByName("Eiscreme")));
            products.add(new Product(13, "Aufbackbrötchen 300g", "", CategoryProvider.getCategoryByName("Brot & Backwaren")));
            products.add(new Product(14, "Toast 300g", "", CategoryProvider.getCategoryByName("Brot & Backwaren")));
            products.add(new Product(15, "Schwarzbrot 300g", "", CategoryProvider.getCategoryByName("Brot & Backwaren")));
            products.add(new Product(16, "Vollkornbrot 300g", "", CategoryProvider.getCategoryByName("Brot & Backwaren")));
            products.add(new Product(17, "Kartoffel Chips 150g", "", CategoryProvider.getCategoryByName("Süßigkeiten & Snacks")));
            products.add(new Product(18, "Erdnüsse 90g", "", CategoryProvider.getCategoryByName("Süßigkeiten & Snacks")));
            products.add(new Product(19, "Kekse 150g", "", CategoryProvider.getCategoryByName("Süßigkeiten & Snacks")));
            products.add(new Product(20, "Pralinen 100g", "", CategoryProvider.getCategoryByName("Süßigkeiten & Snacks")));
            products.add(new Product(21, "Schoko Riegel 90g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(22, "Wasser still 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(23, "Wasser Medium 500ml", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(24, "Mozzarella 100g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(25, "Hackfleisch 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(26, "Steak 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(27, "Bananen 1kg", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(27, "Erdbeeren 250g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(28, "Tomaten 1kg", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(29, "Butter 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(30, "Salami-Aufschnitt 100g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(31, "Schinken-Aufschnitt 100g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(32, "Putenbrust-Aufschnitt 100g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(33, "Käse-Aufschnitt 100g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(34, "Weizenmehl 1kg", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(35, "Joghurt 3,5% Fett 1kg", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(36, "Pommes Frites 1kg", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(37, "Rahmspinat 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(38, "Buttergemüse 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(39, "Himbeeren 500g","", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(40, "Hühnerfrikassee 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(41, "Lasagne 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(42, "Nudelauflauf 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(43, "Erdnussbutter 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(44, "Erdbeermarmelade 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(45, "Honig 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(46, "Zucker 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(47, "Salz 500g", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(48, "Orangensaft 50% 1L", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(49, "Müllbeutel", "", CategoryProvider.getCategoryByName("Getraenke")));
            products.add(new Product(50, "Küchenrolle", "", CategoryProvider.getCategoryByName("Getraenke")));





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
