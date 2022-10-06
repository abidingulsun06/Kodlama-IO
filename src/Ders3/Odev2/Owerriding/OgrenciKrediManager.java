package Ders3.Odev2.Owerriding;

public class OgrenciKrediManager extends BaseCrediManager{

    @Override
    public double hesapla(double tutar){
      return (tutar * 1.10);
    }

}
