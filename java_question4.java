import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class java_question4 {

    // Rastgele veri seti oluşturma
    public static List<Integer> generateRandomList(int size, int lowerBound, int upperBound) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        while (list.size() < size) {            // Veri seti boyutu kadar rastgele sayı üretme
            int number = random.nextInt(upperBound - lowerBound + 1) + lowerBound;      // Belirtilen aralıkta rastgele sayı üretme
            if (!list.contains(number)) {       // Aynı sayıyı tekrar eklememek için kontrol
                list.add(number);               // Rastgele sayıyı veri setine ekleme
            }
        }

        return list;        // Oluşturulan rastgele veri setini döndürme
    }

    // Normalizasyon algoritması
    public static List<Double> normalizeData(List<Integer> data) {
        List<Double> normalizedData = new ArrayList<>();        // Normalizasyon sonucunu tutacak liste
        if (data.size() > 1) {                      // Veri seti en az 2 eleman içeriyorsa
            int xmin = Collections.min(data);       // Minimum değeri bulma
            int xmax = Collections.max(data);       // Maksimum değeri bulma
            for (int x : data) {                    // Veri setindeki her bir eleman için normalizasyon hesaplama
                double N = (double)(x - xmin) / (xmax - xmin);          // Normalizasyon formülü
                normalizedData.add(N);                                  // Normalizasyon sonucunu listeye ekleme
            }
        } else {
            normalizedData.add(0.0);    // Veri seti 1 elemanlı ise normalizasyon sonucu 0 olacaktır
        }
        return normalizedData;            // Normalizasyon sonucunu döndürme
    }

    // Diziyi oluşturma ve normalizasyon hesaplama
    public static void main(String[] args) {
        // Rastgele veri seti oluşturma
        List<Integer> data = generateRandomList(500, 1, 10000);

        List<Integer> currentData = new ArrayList<>();          // Normalizasyon yapılacak veri setini tutacak liste
        for (int i = 0; i < data.size(); i++) {
            int value = data.get(i);
            currentData.add(value);
            List<Double> normalizedData = normalizeData(currentData);

            // Veri seti ve normalizasyon adımlarını ekrana yazdırma
            System.out.println("Veri seti (" + currentData.size() + " elemanlı) : " + currentData);
            System.out.println("Normalizasyon : " + normalizedData);
            System.out.println("--------------------------------------------------");

            // Örnek çıktıda olduğu gibi sadece 3 veri için detaylı sonuç gösterme
            if (i == 6) {
                break;
            }
        }
    }
}
