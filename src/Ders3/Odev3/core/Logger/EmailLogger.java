package Ders3.Odev3.core.Logger;

public class EmailLogger implements  IBaseLogger{

    @Override
    public void logMessage(String data) {
        System.out.println("Email İle mesaj yollandı:"+data);
    }
}
