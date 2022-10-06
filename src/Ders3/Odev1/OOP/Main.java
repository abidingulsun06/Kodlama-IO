package Ders3.Odev1.OOP;

import Ders3.Odev1.OOP.Credit.CustomerManager;
import Ders3.Odev1.OOP.Credit.TeacherCreditManager;
import Ders3.Odev1.OOP.entities.Customer;

public class Main {
    public static void main(String[] args) {

        //Solid
        //S = Bir class Sadece bir işi tutar
        //Class
        //Yapacağımız işlemleri tutan veya herhangi br bilgi tutan yapılardır.

        //-> Nesne yönelimli programlama
        //Değişkenlik göstrebilecek projelerde gelişime açık proje yazmak için nesne yönelimli programlama yapıyoruz.

        //İnterface
        //İş yapan sınıfların operasyonlarını imza seviyesinde yazarak yazılımda bağımlılığı korumak adına yapılan çalışmadır
        /*
        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        Company company = new Company();
        company.setTaxNumber("123456");
        company.getTaxNumber();

        Person person = new Person();
        person.setFirstName("Abidin");
        person.setLastName("Gülsün");
        person.setNationalIdentity("1232134");


        CustomerManager customerManager = new CustomerManager(person);
        customerManager.save();
        customerManager.delete();

        CreditManager creditManager = new CreditManager(company);//örneğini oluşturma
        creditManager.Calculate();
        creditManager.save();

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
        */

        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.save();
        customerManager.giveCredit();
        customerManager.delete();

    }
}
