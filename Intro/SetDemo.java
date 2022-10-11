import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> setGetallen = new HashSet<>();
        setGetallen.add(5);
        setGetallen.add(7);
        setGetallen.add(14);
        setGetallen.add(67);
        setGetallen.add(5);

        printSet(setGetallen);

    }

    public static void printSet(HashSet<Integer> set ){
        System.out.println("De set bevat:");
        for(Integer nummer: set){
            System.out.println(nummer);
        }

    }
}
