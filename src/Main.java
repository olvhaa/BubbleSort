import java.util.Scanner;

//import static java.lang.Integer.sizeArray;
import static java.lang.Math.random;

public class Main {
    //public static final int SIZE;
    public static void main(String[] args) {
        System.out.println("BubbleSort");


        Scanner scanner = new Scanner(System.in);
        //System.out.println("Czy tablice wygenerowac czy podajesz wartosci z klawiatury?");
        //System.out.println("Wpisz 1 - wypisywanie z klawiatury");

        // String choice = scanner.nextLine();
        System.out.println("Ile liczb  posortowac");
        int sizeArray = scanner.nextInt();
        int[] numberArray = new int[sizeArray];
        scanner.nextLine();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Czy tablice wygenerowac czy podajesz wartosci z klawiatury?");
        System.out.println("Wpisz 1 - wypisywanie z klawiatury");
        String choice = scanner.nextLine();

        if (!choice.equals("1")) {
            System.out.println("Podaj zakres dolny losowania liczb");
            int start = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj zakres gorny losowania liczb");
            int end  = scanner.nextInt();
            scanner.nextLine();

//           System.out.println("Tablica jest nieposortowana");
            for (int i = 0; i < sizeArray; i++) {
                numberArray[i] = (int) (random() * (end - start)) +start;
                System.out.print(numberArray[i] + ", ");

            }
        } else {
            System.out.printf("Wprowadz kolejno %d liczb\n", sizeArray);
            for (int i = 0; i < sizeArray; i++) {
                numberArray[i] = scanner.nextInt();


            }
            for (int i = 0; i < sizeArray; i++) {
                System.out.print(numberArray[i] + ", ");
            }

        }


        System.out.println();
        System.out.println("Tablica jest posortowana");
        int[] sortedArray = new int[sizeArray];
        sortedArray = bubbleSort(numberArray);
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
    }


    public static int[] bubbleSort(int[] numberArray) {
        int sizeArray = numberArray.length;
        int temp;
        for (int i = sizeArray - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    temp = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = temp;
                }
            }
        }
        return numberArray;
    }

}