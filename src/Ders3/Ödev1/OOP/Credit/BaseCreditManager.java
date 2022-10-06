package Ders3.Ödev1.OOP.Credit;

public abstract class  BaseCreditManager implements CreditManager{

    @Override
    public abstract void Calculate() ;

    @Override
    public void save() {
        System.out.println("Kaydedildi");
    }
}
