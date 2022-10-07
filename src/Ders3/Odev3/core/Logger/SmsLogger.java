package Ders3.Odev3.core.Logger;

public class SmsLogger implements IBaseLogger {
    @Override
    public void logMessage(String data) {
        System.out.println("Sms ile loglandı:"+data);
    }
}
