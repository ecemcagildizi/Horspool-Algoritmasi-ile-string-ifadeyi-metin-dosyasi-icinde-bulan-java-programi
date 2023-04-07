import java.io.IOException; //Giriş ve çıkış işlemlerinde oluşabilecek hatalar için IOException import edildi.

public class Main {
    public static void main(String[] args) throws IOException {
        HorspoolAlgoritması bul = new HorspoolAlgoritması(); // HorspoolAlgoritması sınıfında bulunan fonksiyonları kullanabilmek için bul nesnesi ile HorspoolAlgoritması sınıfı
        // çağırıldı.
        bul.kelime1();
        bul.kelime2();
        bul.kelime3();
        bul.kelime4();
        bul.kelime5();
    }
}