package Ders3.Odev2.Interfaces;

public class OracleCustomerDal implements ICustomerDal,IRepository{

    @Override
    public void add() {
        System.out.println("Oracle ile eklendi");
    }

    @Override
    public void delete() {

    }
}
