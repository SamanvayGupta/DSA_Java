import java.util.Scanner;

public class input_using{
    public static void main (String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Hello, Welcome to the input testing!!\n");
        System.out.print("Enter your integer input: ");
        int a = sr.nextInt();
        System.out.println("Your Input: "+ a);

    }
}