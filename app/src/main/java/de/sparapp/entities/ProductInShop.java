package de.sparapp.entities;

public class ProductInShop {
    private int id;
    private Product product;
    private Shop shop;

    private double price;

    public ProductInShop(int id, Product product, Shop shop, double price) {
        this.id = id;
        this.product = product;
        this.shop = shop;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
