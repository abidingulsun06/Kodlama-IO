package Ders3.Odev2.Interfaces;

public class SqlServerCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Sql Server ile eklendi");
    }
}
