package Ders3.Odev2.Interfaces;

public class MysqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("Mysql'e eklendi.");
    }

    @Override
    public void delete() {

    }
}
