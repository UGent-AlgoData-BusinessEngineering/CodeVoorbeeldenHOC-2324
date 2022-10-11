import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            Scanner keyb = new Scanner(System.in);
            System.out.println("Aantal donuts ?");
            int donuts = keyb.nextInt();
            System.out.println("Aantal glazen melk");
            int melk = keyb.nextInt();
            if(melk == 0)
                throw new DivideByZeroException("Aantal glazen melk mag niet 0 zijn !!!");
            double donutsperglas = donuts / melk;
            System.out.println("aantal donuts per glas: " + donutsperglas);


        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Er was een probleem!");
        }


    }
}
