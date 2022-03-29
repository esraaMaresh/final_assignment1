import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */
public class inputarray {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=x.nextInt();
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]+"");

        }
    }
}
