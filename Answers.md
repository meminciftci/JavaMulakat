## Görev 1
1. **Sunucu Mimarisi Tasarımı**
    - Projenin temel sunucu mimarisi, modern bir sosyal ağ platformu için tipik olan mikro hizmet mimarisi kullanılarak tasarlanacaktır. Bu mimari, sistemin her bileşeninin bağımsız olarak ölçeklenebilir olmasını sağlar.

2. **Veri Tabanı Yönetimi**
    - MySql, veri tabanı yönetimi için seçilebilir. Her türlü ortam için olan uyumluluğu, farklı sistemlerde kullanım kolaylığı sağlayacaktır.

3. **Ölçeklenebilirlik Stratejileri**
    - Yatay ölçeklendirme ve otomatik ölçeklendirme bu noktada kullanılabilecek mekanizmalar arasına koyulabilir. Sistemin yatay olarak ölçeklendirilmesi yükün dengelenmesini sağlamada etkili olacaktır.

4. **Önbellekleme ve Hızlandırma**
    - Oturumda sık kullanılan veri sorguları için özel bir mekanizma olan Redis bu noktada kullanılabilir. Read Only veriler için ise memcached mekanizması kullanılabilir. Bu mekanizmalara çok hakim olmasam da bu noktalarda kullanılabileceği çıkarımında bulunabilecek kadar biliyorum.

5. **Güvenlik Stratejileri**
    - HTTPS metodunu kullanmak ve her kullanıcıya özel token kullanmak güvenliği sağlayacak iki temel metot olacaktır. Bu sayede güvenli bir haberleşme olacak ve ayrıca geçersiz tokene sahip ya da tokeni olmayan kullanıcılar sınırlandırılacaktır.

6. **Performans İzleme ve Analiz**
    - Performans izleme ve analiz araçları konusunda yeterince bilgiye sahip olmadığım için bu alanı boş bırakıyorum.

## Görev 2
Asal sayıları belirlemek için yazdığım algoritma, “java_question2.java” dosyasının içinde yazılıdır. Algoritmayı çalıştırdığımız anda 2 farklı fonksiyon çağrılıyor: `findLargestPrime` ve `findSmallestPrime`. Verilen limite göre (bu soru için 500.000) limitten büyük en küçük ve limitten küçük en büyük asal sayıları bulmamızı sağlıyor.

Limitten küçük en büyük asal sayıyı bulmak için 500.000’den başlayarak birer birer azaltarak sayıların asal olup olmadığını kontrol ediyoruz. Asıl optimize edilmesi gereken kısım ise burası. Eğer 2’den başlayarak asal olup olmadığını kontrol ettiğimiz sayıya kadar tüm sayılara olan bölünebilirliğini kontrol edersek fazla ve gereksiz sayıda işlem yapmış oluyoruz. Bu yüzden elimizdeki sayının kareköküne kadar olan sayılara olan bölünebilirliğini kontrol ediyoruz. Örneğin elimizdeki sayı 499.999 ise bu sayının karekökü olan 707.106’ya kadar olan sayıları kontrol ediyoruz. Eğer bu aralıktaki herhangi bir sayı 499.999’u tam olarak bölemiyor ise 499.999 bir asal sayıdır diyerek değerimizi bulmuş oluyoruz.

Yukarıda belirttiğimiz asal sayı olup olmadığını kontrol ettiğimiz fonksiyonu aynı şekilde limitten büyük en küçük asal sayıyı bulmak için de kullanabiliriz. Bu sefer birer birer azaltmak yerine birer birer artırarak ilerliyoruz. 

Sonuçları bulduktan sonra ise sırayla hepsini yazdırıyoruz. 500.000’den küçük en büyük asal sayıyı, 500.000’den büyük en küçük asal sayıyı ve aralarındaki farkı, yanlarında açıklamaları olacak şekilde kullanıcıya gösteriyoruz.

Kodu terminali kullanarak çalıştırmak istiyor iseniz yapmanız gereken adımlar şu şekildedir:
1. “java_question2.java” dosyasının bulunduğu directory’e gelin.
2. “java .\java_question2.java” komutunu terminale yazın. Algoritmanın çıktısı terminale yazılacaktır.

## Görev 3
Web Uygulaması geliştirme üzerine çok fazla bir deneyimim olmadığı için bu kadar kısa bir sürede bu görevi tamamlayabilmem mümkün olmadı. Bir kez Python django framework’ünü kullanarak bir Web uygulaması geliştirmiştim ancak Core Java ile bunu yapabilmem için bir miktar daha zamana ihtiyacım var. O yüzden üzülerek bu alanı boş bırakıyorum.

## Görev 4

Öncelikle 500 elemana sahip ve her elemanı 1 ve 10.000 arasında değer alan bir liste oluşturalım. Yeni oluşturacağımız başka bir listede ise sırasıyla 0. endeksten başlayarak ilk oluşturulan listedeki elemanları ekleyelim. Her eklemede minimum ve maksimum değerler hesaplanmalı ve bu hesaplara göre normalizasyon yapılmalı. Bu normalizasyon değerleri ise başka bir listede tutulmalı ki çıktı olarak verebilelim. 
	
Algoritmanın implementasyonuna “java_question2.java” dosyasından ulaşabilirsiniz. 


## Görev 5

1. SQL Sorgusu ile Her Departmandaki Çalışan Sayısını Hesaplama

Aşağıda, her departmandaki çalışan sayısını hesaplayan ve sonucu departman adıyla birlikte listeleyen bir SQL sorgusu bulunmaktadır:

```sql
SELECT Dept.Name AS DepartmentName, COUNT(Emp.Id) AS EmployeeCount
FROM Dept
LEFT JOIN Emp ON Dept.Id = Emp.DeptId
GROUP BY Dept.Name;
```

Dept.Id ve Emp.Id’nin aynı olduğu satırları left join ile birleştiriyoruz ve sonuç olarak elde ettiğimiz tabloyu Dept.Name’e göre grupluyoruz. Gruplamadan sonra ise DepartmentName ve EmployeeCount olmak üzere iki sütun ve 5 satır büyüklüğünde bir çıktı vereceğiz.

2.	Departman Adı ile Birlikte Sorgu: Yukarıdaki SQL sorgusu departman adını içermektedir (DeparmentName).

3.	Satır Sayısı: 5 satır listelenecektir. Elimizde 5 adet farklı departman olduğu için her bir departman bilgileri için bir satırımız olacağını düşünür isek 5 satır beklenilen çıktı olacaktır.


## Soru 1
Uygulama geliştirirken Java kullanma fırsatım hiç olmadı. Ancak Python üzerinden Django framework’ünü kullanarak bir web uygulaması geliştirdim. MySql veri tabanını kullanarak yaptığım bir projemdi. Ancak localimizde gösterdiğim için uygulama güvenliği adına bir adım atmadım. Daha çok veri tabanın kullanabildiğimizi gösterdiğimiz bir proje idi.

XSS saldırıları, bir web uygulamasının kullanıcı girdilerini doğru bir şekilde doğrulamadığı durumlarda ortaya çıkar ve saldırganın kötü niyetli kodu bir kullanıcının tarayıcısında çalıştırmasına olanak tanır. Kullanıcıdan alınan tüm girdilerin beklenen veri formatına uygun olup olmadığı kontrol edilmeli ve zararlı olabilecek karakterler temizlenmelidir.

SQL enjeksiyonu, kullanıcı girdilerinin SQL sorgularına dahil edilerek zararlı SQL kodlarının çalıştırılmasına yol açan bir güvenlik açığıdır. SQL sorgularını doğrudan kullanıcı girdileri ile birleştirmek yerine, hazırlanan ifadeler kullanarak sorguların parametrelerle oluşturulması, SQL enjeksiyonun önüne geçmek için yapılabilecek en etkili çözümlerden biridir.

CSRF saldırıları, kullanıcıların istemeden zararlı işlemler gerçekleştirmelerine yol açar. Saldırgan, bir kullanıcının tarayıcısına kötü niyetli bir istek gönderir ve bu istek kullanıcının kimlik bilgileriyle işlenir. Her form ve her istek için benzersiz bir CSRF tokeni oluşturup doğrulayarak bu tür saldırıları önüne kolayca geçilebilir.

IDOR saldırıları, yetkisiz kullanıcıların hassas verilere doğrudan erişmesine olanak tanır. Bu, genellikle URL veya form parametreleri aracılığıyla gerçekleştirilir. Herhangi bir nesneye erişmeden önce, kullanıcının bu nesneye erişim iznine sahip olup olmadığını doğrulamak için erişim kontrolü uygulanır ise, IDOR saldırılarının önüne kolayca geçilebilir.

Güvenlik açıkları genellikle uygulama geliştiricilerinin yeteri kadar özen göstermemesi sonucu ortaya çıkan sonuçlardır. Bundan dolayı best practice’tan elden geldiğince taviz verilmemelidir.

## Soru 2
Java programlama dilini projelerimde çok fazla kullanmamış olsam da üniversitemdeki 3 senemde Java hakkında birçok şey öğrendim. Bu öğrendiklerimden yola çıkarak bu soruyu elimden geldiğince cevaplayacağım.

JVM, java uygulamalarının çalışabilmesi için gerekli olan temel sanal ortamdır. Özellikle java bu tarafıyla diğer dillerden ayrılır. İşletim sisteminin üzerinde başka bir sanal ortama ihtiyaç duyması her ne kadar verimlilikten ödün verse de, bu sayede daha modüler bir yapıya sahip olmasını da sağlamıştır. Windows, linux veya MacOS fark etmeksizin her işletim sisteminde sorunsuz bir şekilde çalışmasını garantileyen bir yönüdür. Bu nedenden dolayı Java Virtual Machine üzerinde yapılan herhangi bir optimizasyon Java uygulamalarının çalışma hızını büyük ölçüde etkileyebilir. Bu optimizasyonlar şu şekilde listelenebilir:
1. Heap boyutunun JVM heap boyutu ile aynı olmasını sağlayarak performansta artış.
2. Uygun bir Garbage Collection algoritması ile JVM üzerinde çalıştırılan uygulamaların heap management’ı optimize etmek.

Veri tabanı endeksleme ise performansı etkileyen bir diğer etmenlerden biridir. Sık kullanılan sorgulara göre bir endeks belirlenmelidir ki bu sayede arama işlemlerinde veya ekleme çıkarma işlemlerinde en optimize şekilde çalışılabilsin. 

Kod yazılırken en uygun veri tiplerinin kullanılması da optimizasyon için olmazsa olmazlardan biridir. Veri tipleri genellikle hızları, kapladıkları alan ve kullanılma kolaylıklarından dolayı tercih edilir. Örneğin ArrayList kullanımı kolay iken kapladığı yerin çok oluşu ve çalışma hızının yavaşlığı neden ile tercih edilmeyebilir. Array ise tam tersi daha ilkel bir veri tipi olduğu için az yer kaplar ve daha hızlı çalışır. İlkelliği nedeni ile de kullanımı kısıtlı ve zordur. Bu gibi farklı özelliklerinden dolayı hangi data tipi ile çalışılacağını seçmek, uygulamanın hızını ve kullanım kolaylığını optimize etmek için kritik bir rol oynamaktadır.

İyi bir yazılım mimarisi uzun vadede uygulamanın sürekliliğini sağlar ve uygulamanın ömrü boyunca her zaman kritik bir rolü vardır. Bu sebeple katmanlı, gerektiği yerde komplike gerektiği yerde basit bir mimari ile sorumlulukların dağıtıldığı bir yazılım yapısı gerekliliklerden biridir. Asenkron işler belirlenmeli, bu işlemler farklı threadlerde elden geçirilerek sistemin hızı artırılmalıdır. 

## Soru 3
Öncelikle kullandığım tasarım şablonlarını listeleyeyim:
1. Factory Method Tasarım Şablonu
2. Observer Tasarım Şablonu

Factory Method Tasarım Şablonu’nu alt sınıfların bulunduğu ve bu sınıfların ortak bir sınıfta birleştiği zamanlarda kullanma fırsatım oldu. Örnek vermem gerekir ise yaptığım bir ödevde superclass olarak animal class’ı vardı ve tüm hayvan türleri bu class’a bağlı idi. Superclass’tan inherit ettikleri ses çıkarma, yemek yeme, yürüme gibi fonksiyonlar vardı ve bu fonksiyonları override ederek kendilerine göre özelleştiriyorlardı. Ayrıca her farklı tür hayvanın diğer hayvan türlerine kıyasla farklı yeni fonksiyonları da vardı. 

Observer Tasarım Şablonu ise daha çok iletişim fonksiyonalitesi gerektiren işlerde kullanılan bir iskelet. Teorik olarak bilsem de herhangi bir projemde imlemente etme fırsatım olmadı.

## Soru 4

Belirttiğiniz web servislerini geliştirme deneyimim bulunmamakta ancak bulunduğum bir projede backend takımının RESTful API kullanmasından dolayı bir miktar öğrenme fırsatım oldu. Bulunduğum mobil geliştirme tarafında API endpoint ile iletişime geçmemiz gerekiyordu ve bu iletişimi JSON veri formatı ile gerçekleştirdik. Okuması ve işlemesi kolay bir veri yapısı olduğu için JSON tercihimiz olmuştu. Diğer bir seçenek ise plain text kullanmak idi ancak veriyi ayrıştırma konusunda biraz uğraştırıcı olacağı için tercihimiz bu yönde olmadı.

Web ve mobil geliştirme için kullandığımız JavaScript ve TypeScript ile uyumlu olduğu için JSON daha çok tercih edilen bir formattır. Daha hızlı ve az yer kaplaması ile kullanışlı bir veri formatıdır.

XML ise daha donanımlı ve yapılandırılmış bir veri formatı olarak karşımıza çıkıyor. Ancak kapladığı alan ve işlenme hızındaki yavaşlık nedeniyle bir miktar pahalı bir formattır. 
	
Güvenlik önlemlerinden bahsetmemiz gerekir ise öncelikle kendi projemizde kullanmış olduklarımızdan başlamak isterim. HTTPS ve HTTP yöntemlerinden birini seçmemiz ve GET, POST, DELETE vb. metotları seçtiğimiz iletişim yolu ile uygulamamız gerekiyordu. Güvenlik nedenlerinden dolayı HTTPS ilk seçimimiz oldu. Ayrıca her kullanıcı için token üretip her API endpoint ile iletişim kurulduğunda token’in geçerliliğini de kontrol ediyordu. Kullanıcının şifresini plain text olarak tutmuyor, encription metotları ile gizli bir şekilde veri tabanımızda barındırıyorduk. 

## Soru 5

Cevap:  +-------+ 
        | cust_not_123_total | 
        +-------+ 
        | 85 | 
        +-------+

İlk sorgu sonucu bize toplamda 100 adet sipariş olduğunu gösteriyor. İkinci sorgu ise toplamda kaç adet siparişin müşteri kimlik numarasının 123’e eşit olduğunu gösteriyor ki bu değer de 15’e eşit. Bizden istenen ise kimlik numarası 123’e eşit olmayan siparişlerin toplam sayısı. Bu değer ise toplam 100 – 15 = 85’e denk geliyor.


