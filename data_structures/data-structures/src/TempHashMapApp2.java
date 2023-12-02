import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TempHashMapApp2 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapWordFreq = new HashMap<>();
        //String example = "a b c a b c e a b c d e e b c d e b b a a a";
        String example = "Karadeniz'de keşfedilen doğalgazın milli sisteme bağlanması yönünde yürütülen çalışmalarda gelinen aşama da Cumhurbaşkanlığı Kabinesi'nin gündeminde olacak.\n" +
                "Enerji ve Tabii Kaynaklar Bakanı Fatih Dönmez, Karadeniz gazıyla ilgili gelişmeleri kabinede anlatacak.\n" +
                "AA'nın haberine göre Erzurum'da dün yaptığı açıklamada, \"Pazartesi günü bu konuda yeni müjdeleri milletimizle paylaşacağız.\" diyen Cumhurbaşkanı Recep Tayyip Erdoğan'ın kabine sonrası millete sesleniş konuşmasında alınan kararları kamuoyuyla paylaşması bekleniyor.\n" +
                "Yunanistan'ın Ta Nea gazetesindeki haberde, Girit'in güneyinde ve batısında kara sularının 12 mile çıkarılmasına ilişkin planın 2020'den beri olduğuna işaret edildi.";
        String[] tokens = example.split("");

        for (String token : tokens) {
            Integer freq = mapWordFreq.get(token);
            if (freq == null) {
                freq = 0;
            }
            freq++;
            mapWordFreq.put(token, freq);
        }
        printMap(mapWordFreq);
    }

    private static void printMap(HashMap<String, Integer> map) {
        Set keySet = map.keySet();
        Iterator iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            Integer value = map.get(key);
            System.out.println(key + "\t>>\t" + value);
        }
    }
}