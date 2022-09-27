public class SelectionSort {

    public static void main(String[] args) {
        int[] test = {7,8,4,1,9, 25, 3};
        printResult(test);
        int[] result = selectionSort(test);
        printResult(result);
    }

    public static int[] selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int indexKleinste = bepaalIndexLaagste(i, array);
            swap(i, indexKleinste, array);
        }

        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int bepaalIndexLaagste(int i, int[] array) {
        int laagste = i;
        for(int j = i+ 1; j < array.length; j++){
            if(array[j] < array[laagste])
                laagste = j;
        }
        return laagste;
    }

    private static void printResult(int[] array){
        for(int i: array){
            System.out.println(i);
        }
    }


}
