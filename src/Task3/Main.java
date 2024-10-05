package Task3;

public class Main {
    public static void main(String[] args) {

        int j = 1;
        double suma = 0 ;
        for (int i = 3;i<=99;i=i+2)
        {
            suma = suma + (double) j /i;

            System.out.println(j+"/"+i);
            j=i;
        }
        System.out.println("Suma este :"+suma);
    }
}
