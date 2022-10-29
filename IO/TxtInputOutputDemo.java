import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TxtInputOutputDemo {
    public void txtFileOutput(String bestandsnaam){
        // aanmaken printwriter object
        PrintWriter out = null;
        try{
            out = new PrintWriter(bestandsnaam);
        }
        catch (Exception e){

        }

        //lijnen tekst vragen en onmiddelijk inlezen
        System.out.println("Geef drie lijnen tekst:");
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i< 3; i++){
            String line = keyboard.nextLine();
            out.println(line);
        }
        out.close();

        //sluiten stream

        System.out.println("De lijnen tekst werden weggeschreven naar " + bestandsnaam);

    }

    public void txtFileInput(String bestandsnaam){
        //Scanner object aanmaken voor txt input
        Scanner input = null;
        try {
            input = new Scanner(new File(bestandsnaam));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //alle lijnen van txt bestand inlezen en printen
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }

        //Scanner object sluiten

    }

    public static void main(String[] args) {
        TxtInputOutputDemo test1 = new TxtInputOutputDemo();
        test1.txtFileOutput("resultaat.txt");
        test1.txtFileInput("resultaat.txt");

    }
}
