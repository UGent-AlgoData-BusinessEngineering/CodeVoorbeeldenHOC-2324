import java.util.ArrayList;
import java.util.Scanner;


public class ListDemo {



    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        boolean einde = false;
        Scanner keyboard = new Scanner(System.in);
        while(!einde){
            System.out.println("To do Item ?");
            String line = keyboard.nextLine();
            toDoList.add(line);
            System.out.println("Nog item (ja of nee)?");
            String antwoord = keyboard.nextLine();
            if(antwoord.equals("Nee"))
                einde = true;
        }

        System.out.println("De lijst bestaat uit:");
        for(String item: toDoList){
            System.out.println(item);
        }

    }
}
