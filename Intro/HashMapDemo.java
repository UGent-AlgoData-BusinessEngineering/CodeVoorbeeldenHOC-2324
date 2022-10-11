import java.util.HashMap;

public class HashMapDemo {

    // Mount Everest 29029
    //K2 28251
    //Denali 20335

    public static void main(String[] args) {
        HashMap<String, Integer> bergen = new HashMap<>();
        bergen.put("Mount Everest", 29029);
        bergen.put("K2", 28251);
        bergen.put("Denali", 20335);
        printMap(bergen);

    }

    public static void printMap(HashMap<String, Integer> bergen){
        for(String berg: bergen.keySet()){
            System.out.println(berg + ":" + bergen.get(berg));
        }

    }
}
