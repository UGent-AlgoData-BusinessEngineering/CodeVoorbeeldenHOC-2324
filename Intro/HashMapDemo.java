import java.util.HashMap;

public class HashMapDemo {

    // Mount Everest 29029
    //K2 28251
    //Denali 20335

    public static void main(String[] args) {
        // Toevoegen bergen aan hashmap

    }

    public static void printMap(HashMap<String, Integer> bergen){
        for(String berg: bergen.keySet()){
            System.out.println(berg + ":" + bergen.get(berg));
        }

    }
}
