package Ders3.Odev2.Polimorphism;

public class DatabaseLogger extends BaseLogger {
    public  void log(String message){
        System.out.println("Logged to database:"+message);
    }
}
