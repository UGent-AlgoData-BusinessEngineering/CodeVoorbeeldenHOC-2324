import java.util.ArrayList;
import java.util.Scanner;


public class ListDemo {



    public static void main(String[] args) {

        // aanmaken arraylist ToDo van Strings
        ArrayList<String> todoLijst = new ArrayList<>();

        boolean einde = false;
        Scanner keyboard = new Scanner(System.in);
        while(!einde){
            System.out.println("To do Item ?");
            String line = keyboard.nextLine();
            // toevoegen aan ToDo list
            todoLijst.add(line);
            System.out.println("Nog item (ja of nee)?");
            String antwoord = keyboard.nextLine();
            if(antwoord.equals("nee"))
                einde = true;
        }

        System.out.println("De lijst bestaat uit:");
        // Printen items list
        for(String item: todoLijst){
            System.out.println(item);
        }

    }
}
