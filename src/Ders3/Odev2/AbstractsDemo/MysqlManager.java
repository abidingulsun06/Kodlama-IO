package Ders3.Odev2.AbstractsDemo;

public class MysqlManager extends DatabaseManager{

    @Override
    public void getData() {
        System.out.println("Mysql ile veriler listelendi");
    }
}
