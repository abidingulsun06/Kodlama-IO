package Ders3.Odev3.core.Logger;

public class FileLogger implements IBaseLogger{

    @Override
    public void logMessage(String data) {
        System.out.println("Dosyaya loglandı:"+data);
    }
}
