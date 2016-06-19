package de.sparapp.providers;

import java.util.ArrayList;
import java.util.List;

import de.sparapp.entities.Category;

public class CategoryProvider {
    private static List<Category> categories;

    private static void init() {
        if(categories == null) {
            categories = new ArrayList<>();

            categories.add(new Category(1, "Getraenke"));
            categories.add(new Category(2, "Hygiene"));
            categories.add(new Category(3, "Tiefkuehl"));
            categories.add(new Category(4, "Fleisch"));
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
