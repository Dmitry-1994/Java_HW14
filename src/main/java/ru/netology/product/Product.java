package ru.netology.product;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean matches(String search) {
        return name.contains(search);
    }

    public int getId() {
        return id;
    }
}
