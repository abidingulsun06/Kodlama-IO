package Ders3.Odev2.StaticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        ProductValidator productValidator = new ProductValidator();
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.price = 10;

        ProductValidator.bisey();
        productManager.add(product);

        DatabaseHelper.Crud.delete();
    }
}

