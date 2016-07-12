package de.sparapp.providers;

import java.util.ArrayList;
import java.util.List;

import de.sparapp.entities.Shop;

public class ShopProvider {
    private static List<Shop> shops;

    private static void init() {
        if(shops == null) {
            shops = new ArrayList<>();

            shops.add(new Shop(1, "Walmart", 0.5));
            shops.add(new Shop(2, "Coop", 15.5));
            shops.add(new Shop(3, "Morrisons", 0.9));
            shops.add(new Shop(4, "Aldi", 1.9));
            shops.add(new Shop(5, "Lidl", 14.3));
            shops.add(new Shop(6, "Tesco", 21.4));
        }
    }

    public static List<Shop> getShops() {
        init();

        return shops;
    }

    public static Shop getShopByName(String name) {
        init();

        for(Shop shop : shops) {
            if (shop.getName().equalsIgnoreCase(name)) {
                return shop;
            }
        }
        return null;
    }
}
