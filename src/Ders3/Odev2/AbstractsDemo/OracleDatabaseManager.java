package Ders3.Odev2.AbstractsDemo;

public class OracleDatabaseManager extends DatabaseManager{
    @Override
    public void getData() {
        System.out.println("Oracle ile veriler listelendi");
    }
}
