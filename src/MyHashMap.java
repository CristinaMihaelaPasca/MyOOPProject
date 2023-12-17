import java.util.Dictionary;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args){
        HashMap <Integer, String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1,"First");
        dictionarulNostru.put(2,"Second");
        dictionarulNostru.put(3, "Third");
        dictionarulNostru.put(4,"Forth");
        dictionarulNostru.replace(3,"Third-replaced"); //3, Third-replaced
        System.out.println(dictionarulNostru.replace(3,"Third","Third-replaced"));

        System.out.println(dictionarulNostru.get(3));
        System.out.println(dictionarulNostru.keySet());
        System.out.println(dictionarulNostru.values());
        System.out.println(dictionarulNostru.size());
        dictionarulNostru.remove(3);
        System.out.println(dictionarulNostru.size());
        System.out.println(dictionarulNostru.entrySet());
        dictionarulNostru.replace(2,"Second-replaced");
        System.out.println(dictionarulNostru.get(2));
        System.out.println(dictionarulNostru.containsValue("First"));
        System.out.println(dictionarulNostru.containsKey(1));

        for(int key: dictionarulNostru.keySet()){
            System.out.println(key);
        }
        for(String value: dictionarulNostru.values()){
            System.out.println(value);
        }

        HashMap <String,Boolean> dictionarStudenti = new HashMap<>();
        dictionarStudenti.put("Ioana", true);
        dictionarStudenti.put("Cristina", true);
        dictionarStudenti.put("Florin", false);
        dictionarStudenti.put("Rares", false);
        dictionarStudenti.put("Diana", true);







    }
}
