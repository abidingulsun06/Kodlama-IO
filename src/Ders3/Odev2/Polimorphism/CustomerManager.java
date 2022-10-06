package Ders3.Odev2.Polimorphism;

public class CustomerManager {

    private  BaseLogger baseLogger;

    CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }


    public void add(){
        System.out.println("Müşteri eklendi");
        baseLogger.log("log mesajı");
    }
}
