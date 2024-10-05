package Task2;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i=100;i<=1000;i++)
        {
            if (i%5 == 0 && i%6 == 0) {counter++; System.out.print(i+" "); if (counter%10 == 0 ) {System.out.println();}}
           // else if (i%6 == 0) {counter++; System.out.print(i+" "); if (counter%10 == 0 ) {System.out.println();}}



        }

    }
}
