package Ders3.Odev1.OOP.Credit;

import Ders3.Odev1.OOP.entities.Customer;

public class CustomerManager {

    //Dal DataAccess Layer veri erişim katmanı
    private Customer customer;
    private CreditManager creditManager;

    public CustomerManager(Customer customer,CreditManager creditManager){
        this.customer=customer;
        this.creditManager=creditManager;
    }

    public void save() {
        System.out.println("Müşteri Eklendi:");
    }

    public void delete() {
        System.out.println("Müşteri silindi:" );
    }

    public void giveCredit(){
        creditManager.Calculate();
    }
}