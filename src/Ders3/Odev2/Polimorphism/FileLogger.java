package Ders3.Odev2.Polimorphism;

public class FileLogger extends BaseLogger {
    public  void log(String message){
        System.out.println("Logged to file:"+message);
    }
}
