# Horspool-Algoritmasi-ile-string-ifadeyi-metin-dosyasi-icinde-bulan-java-programi
HORSPOOL ALGORİTMASI NEDİR VE NE İÇİN KULLANILIR? <br/><br/>
Horspool Algoritması bir metin içerisinde verilen kelimenin bulunmasını sağlayan algoritmadır. Metin içerisinde bulunan herhangi bir harf için aranılan kelimenin en 
soldaki harfi bulunmaya çalışılır. Sırasıyla gelen harfler birbirleriyle eşleştiği sürece işlem devam eder ve eşleşme yapılırken uyuşma olup olmadığına bakılmaksızın 
aranılan kelime için arama işlemi devam eder. Metin dosyasındaki bütün karakterler ile eşleşme işlemi bittikten sonra arama işlemi sonlanır. <br/><br/>

HORSPOOL ALGORİTMASI ÇALIŞMA ZAMANI ANALİZİ NEDİR? <br/><br/>
Horspool Algoritmasının en iyi ve ortalama çalışma zamanı O (N)’dir. En iyi ve ortalama çalışma zamanının elde edildiği arama algoritmaları Doğrusal (Linear) ve
Booyer-Moore algoritmalarıdır. Horspool Algoritmasının en kötü çalışma zamanı ise O (MN)’dir. Burada bulunan N aranılan kelimenin boyunu, M ise aranılan kelimenin
eşleneceği kelimenin boyunu temsil eder. <br/><br/>

![horspool algoritması](https://github.com/ecemcagildizi/Horspool-Algoritmasi-ile-string-ifadeyi-metin-dosyasi-icinde-bulan-java-programi/blob/main/%C4%B1mages/horspool.png)
<br/><br/>

Yukarıda bulunan kod parçacığı üzerinden çalışma zamanı hesaplaması yapacak olursak; int m satırı = 1, int n satırı = 1, for döngüsü = M, int count satırı = 1, 
int i satırı = 1, dış kısımdaki while = N, int k satırı = 1, iç kısımdaki while döngüsü = M, if satırı =1’dir. Toplam=3MN+M+3 şeklinde olur ve buna bağlı olarak 
çalışma zamanı O(MN) olarak bulunur.


