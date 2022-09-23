package Ders2.Odev1.classesWithAttribute;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        Product product2 = new Product(2,"Klavye","Logitech Klavye",5000,3,"Siyah");

        System.out.println(product2.getProductName());

        product.setId(1);
        int id = product.getId();

        product.setProductName("Laptop");
        String name = product.getProductName();

        product.setDescription("Asus laptop");
        String desc = product.getDescription();

        product.setPrice(5000);
        double price = product.getPrice();

        product.setStockAmount(3);
        int stock = product.getStockAmount();

        Object[] arr = new Object[]{id, name, desc, price, stock};

        for (Object arrys : arr) {
            System.out.println(arrys);
        }
        System.out.println("--------");


        productManager productManager = new productManager();
        productManager.add(product);

        System.out.println(product.getKod());

    }
}
