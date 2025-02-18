import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

public class ArrayListFun {
    public static void main(String[] args) {
        try{
        
        File a = new File("randomNumbers.txt");
        Scanner reader = new Scanner(a);
        int i = 0;
        int sum = 0;
        int greatest = 0;
        int product = 1;
        while(reader.hasNext()) {
            int x = reader.nextInt();
            i++;
            sum += x;
            product *= x;
            if (x>greatest) {
                greatest = x;
            }
        }
            System.out.println(i);
            System.out.println(sum);
            System.out.println(greatest);
            System.out.println(product);
        } catch (FileNotFoundException ex) {
            System.out.println("Wrong file bro");
        } catch (InputMismatchException ex) {
            System.out.println("Your file has something other than numbers.");
        }

















        // int sum = 0;
        // int product = 1;
        // int[] numbers = new int[3];
        // ArrayList<Integer> numbersAL = new ArrayList<>();

        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;
        // //numbers[3] = 4;

        // numbersAL.add(1);
        // numbersAL.add(3);
        // numbersAL.add(7);
        // int length = numbersAL.size();
        // for (int i=0; i<3; i++) {
        //     System.out.println("Position "+ i + ": " + numbersAL.get(i));
        //     sum += numbersAL.get(i);
        //     product *= numbersAL.get(i);
        // }
        // // for (int i:numbersAL) {
        // //     System.out.println("Position "+ i + ": " + numbersAL.get(i));
        // //     sum += numbersAL.get(i);
        // //     product *= numbersAL.get(i);
        // // }
        // System.out.println("The sum is: " + sum);
        // System.out.println("The product is: " + product);




    }


}