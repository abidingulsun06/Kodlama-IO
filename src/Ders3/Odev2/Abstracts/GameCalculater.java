package Ders3.Odev2.Abstracts;

public abstract class GameCalculater {

    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
