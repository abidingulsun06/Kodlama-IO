package Ders3.Odev2.AbstractsDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MysqlManager();

        customerManager.getCustomer();
    }
}
