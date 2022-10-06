package Ders3.Odev2.Polimorphism;

public class EmailLogger extends BaseLogger {
    public  void log(String message){
        System.out.println("Logged to email:"+message);
    }
}
