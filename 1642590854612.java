import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */
public class UsingMethod {
    public static void main(String[] args) {

        int[] array=new int[5];

       input(array);
        print(array);
    }

    public static void print(int[] x) {
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]+"");
        }
    }

    public static void input(int[] y) {
        Scanner x=new Scanner(System.in);

        for (int i = 0; i < y.length; i++) {
            y[i]=x.nextInt();
        }
    }

    }

