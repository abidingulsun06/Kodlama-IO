package Ders3.Odev2.Interfaces;

public class CustomerManager{
    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal){
            this.iCustomerDal=iCustomerDal;
    }

    public void add(){
      iCustomerDal.add();
    }
}
