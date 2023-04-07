import java.io.IOException; //Giriş ve çıkış işlemlerinde oluşabilecek hatalar için IOException import edildi.
import java.nio.file.Files; // Dosya üzerinde static işlemleri gerçekleştirmek için import edildi.
import java.nio.file.Paths; // Paths ve File dönüşümleri için import edildi.
import java.util.HashMap; // Girilen verileri birbirleriyle eşleştirmek için HashMap import edildi.
import java.util.Map; // Anahtarları değerlere eşleştirmek için Map import edildi.

public class HorspoolAlgoritması {
    public void kelime1() throws IOException{ //Dosya işlemleri gerçekleşirken oluşabilecek herhangi bir hata durumunda kullanıcıya hata fırlatmak için IOException throws edildi.
        String pattern = "upon"; // Bu kısımda tanımlanan pattern değişkeni metin içerisinde aranacak olan değişkeni tutuyor.
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt"))); // text değişkeni metin dosyasını tutuyor ve readAllBytes
        // ile dosyanın içeriğini bayt dizisi olarak okuyor.

        int count = horspool(text, pattern); // Aranan kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutan count değişkenin değerini almak için horspool fonksiyonu çağırıldı.
        System.out.println(pattern +" kelimesi metin içerisinde "+ count + " defa geçmektedir.");
    }

    public void kelime2() throws IOException{ //Dosya işlemleri gerçekleşirken oluşabilecek herhangi bir hata durumunda kullanıcıya hata fırlatmak için IOException throws edildi.
        String pattern = "sigh"; // Bu kısımda tanımlanan pattern değişkeni metin içerisinde aranacak olan değişkeni tutuyor.
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt"))); // text değişkeni metin dosyasını tutuyor ve readAllBytes
        // ile dosyanın içeriğini bayt dizisi olarak okuyor.

        int count = horspool(text, pattern); // Aranan kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutan count değişkenin değerini almak için horspool fonksiyonu çağırıldı.
        System.out.println(pattern +" kelimesi metin içerisinde "+ count + " defa geçmektedir.");
    }

    public void kelime3() throws IOException{ //Dosya işlemleri gerçekleşirken oluşabilecek herhangi bir hata durumunda kullanıcıya hata fırlatmak için IOException throws edildi.
        String pattern = "Dormouse"; // Bu kısımda tanımlanan pattern değişkeni metin içerisinde aranacak olan değişkeni tutuyor.
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt"))); // text değişkeni metin dosyasını tutuyor ve readAllBytes
        // ile dosyanın içeriğini bayt dizisi olarak okuyor.

        int count = horspool(text, pattern); // Aranan kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutan count değişkenin değerini almak için horspool fonksiyonu çağırıldı.
        System.out.println(pattern +" kelimesi metin içerisinde "+ count + " defa geçmektedir.");
    }

    public void kelime4() throws IOException{ //Dosya işlemleri gerçekleşirken oluşabilecek herhangi bir hata durumunda kullanıcıya hata fırlatmak için IOException throws edildi.
        String pattern = "jury-box"; // Bu kısımda tanımlanan pattern değişkeni metin içerisinde aranacak olan değişkeni tutuyor.
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt"))); // text değişkeni metin dosyasını tutuyor ve readAllBytes
        // ile dosyanın içeriğini bayt dizisi olarak okuyor.

        int count = horspool(text, pattern); // Aranan kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutan count değişkenin değerini almak için horspool fonksiyonu çağırıldı.
        System.out.println(pattern +" kelimesi metin içerisinde "+ count + " defa geçmektedir.");
    }

    public void kelime5() throws IOException{ //Dosya işlemleri gerçekleşirken oluşabilecek herhangi bir hata durumunda kullanıcıya hata fırlatmak için IOException throws edildi.
        String pattern = "swim"; // Bu kısımda tanımlanan pattern değişkeni metin içerisinde aranacak olan değişkeni tutuyor.
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt"))); // text değişkeni metin dosyasını tutuyor ve readAllBytes
        // ile dosyanın içeriğini bayt dizisi olarak okuyor.

        int count = horspool(text, pattern); // Aranan kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutan count değişkenin değerini almak için horspool fonksiyonu çağırıldı.
        System.out.println(pattern +" kelimesi metin içerisinde "+ count + " defa geçmektedir.");
    }

    public static int horspool(String text, String pattern) {
        Map<Character, Integer> shiftTable = new HashMap<>(); //Bu kısımda Map, anahtar ile değerleri birbirine eşlerken HashMap bu değerleri tutar.
        int m = pattern.length(); // m değişkeni pattern yani aranan kelimenin uzunluğunu tutar.
        int n = text.length(); // n değişkeni text yani metin dosyasının uzunluğunu tutar.

        for (int i = 0; i < m - 1; i++) { //Bu döngü aranan kelimenin karakaterlerini tutmak için oluşturulmuştur.
            shiftTable.put(pattern.charAt(i), m - 1 - i); //Aranan kelimenin karakterlerini anahtar ile eşler ve yapının içerisinde ekler.
        }

        int count = 0; //count değişkeni aranan kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutar.
        int i = m - 1;
        while (i < n) {
            int k = 0; // Karşılaştırma işlemi için k değişkeni sıfır olarak tanımlandı.
            while (k < m && pattern.charAt(m - 1 - k) == text.charAt(i - k)) { // Aranan kelimenin karakter sayısının metin dosyasındaki ifadenin karakter sayısına eşit olma
                // durumu kontrol edildi. Eşit olma durumunda k değişkeninin birer birer artması istenildi.
                k++;
            }
            if (k == m) { // k değişkeni artarken m değişkenine eşit olma durumu belirtildi.
                count++; // k değişkeninin m değişkenine eşit olması halinde count değerinin birer birer artması istenildi.
            }
            i += shiftTable.getOrDefault(text.charAt(i), m); // Anahtarla hiçbir değer eşleşmemişse varsayılan değeri arttırarak döndürmesi istenilmiştir.
        }
        return count; // Sonuç olarak count değişkenini döndürür.
    }
}
