package Ders3.Odev1.OOP.Credit;

public class TeacherCreditManager extends BaseCreditManager {

    @Override
    public  void Calculate() {
        System.out.println("Öğretmen kredisi Hesaplandı");
    }


    public void save(){
        System.out.println("Öğretmen kredi Eklendi");
    }
}
