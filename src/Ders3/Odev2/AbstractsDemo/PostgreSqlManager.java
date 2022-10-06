package Ders3.Odev2.AbstractsDemo;

public class PostgreSqlManager extends  DatabaseManager{
    @Override
    public void getData() {
        System.out.println("Postgre Sql ile veriler listelendi");
    }
}
