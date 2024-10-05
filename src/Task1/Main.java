package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar -> ");
        int i = sc.nextInt();
        System.out.println();
        int numarulNumerePozitive = 0;
        int numarulNumereNegative = 0;
        int suma = 0 ;
        while (i !=0 )
        {
            if(i < 0)
            {numarulNumereNegative++;}
            if(i > 0)
            {numarulNumerePozitive++;}

            suma = suma +i;
            System.out.print("-> ");
            i = sc.nextInt();
            System.out.println();

        }

        System.out.println("Au fost introduse "+numarulNumerePozitive+" numere pozitive");
        System.out.println("Au fost introduse "+numarulNumereNegative+" numere negative");
        System.out.println("Suma totala a numerelor introduse este : "+suma);

    }
}
