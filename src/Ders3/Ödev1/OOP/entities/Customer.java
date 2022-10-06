package Ders3.Ödev1.OOP.entities;

public class Customer {

    private int id;
    private String city;

    public Customer() {

    }

    public Customer(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }



}

