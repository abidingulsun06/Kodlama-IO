package Ders3.Odev2.AbstractsDemo;

public class SqlServerDatabaseManager extends DatabaseManager{

    @Override
    public void getData() {
        System.out.println("Sql Server ile veriler listelendi");
    }
}
