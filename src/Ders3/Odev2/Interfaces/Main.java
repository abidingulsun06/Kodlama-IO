package Ders3.Odev2.Interfaces;

public class Main {
    public static void main(String[] args) {

        ICustomerDal iCustomerDal = new OracleCustomerDal();
        iCustomerDal.add();

        CustomerManager customerManager= new CustomerManager(new SqlServerCustomerDal());
        customerManager.add();

    }
}
