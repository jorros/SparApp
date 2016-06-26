package de.sparapp.providers;

import java.util.ArrayList;
import java.util.List;

import de.sparapp.entities.Category;

public class CategoryProvider {
    private static List<Category> categories;

    private static void init() {
        if(categories == null) {
            categories = new ArrayList<>();

            categories.add(new Category(1, "Obst"));
            categories.add(new Category(2, "Gemüse"));
            categories.add(new Category(3, "Kräuter"));
            categories.add(new Category(4, "Fleisch"));
            categories.add(new Category(5, "Fisch"));
            categories.add(new Category(6, "Wurst & Aufschnitt"));
            categories.add(new Category(7, "Hygiene"));
            categories.add(new Category(8, "Tiefkuehl"));
            categories.add(new Category(9, "Fleisch"));
            categories.add(new Category(10, "Milch"));
            categories.add(new Category(11, "Eiscreme"));
            categories.add(new Category(12, "Hygiene"));
            categories.add(new Category(13, "Tiefkuehl"));
            categories.add(new Category(14, "Fertiggerichte"));
            categories.add(new Category(15, "Brot & Backwaren"));
            categories.add(new Category(16, "Konserven"));
            categories.add(new Category(17, "Gewürze"));
            categories.add(new Category(18, "Süßigkeiten & Snacks"));
            categories.add(new Category(19, "Schokolade"));
            categories.add(new Category(20, "Haushaltsartikel"));

        }
    }

    public static List<Category> getCategories() {
        init();

        return categories;
    }

    public static Category getCategoryByName(String name) {
        init();

        for(Category category : categories) {
            if (category.getTitle().equalsIgnoreCase(name)) {
                return category;
            }
        }
        return null;
    }
}
