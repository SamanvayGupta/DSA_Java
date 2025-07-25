import java.util.Scanner;

public class loop_for_while{
    public static void main (String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the first value to initalize loop: ");
        int val_1 = sn.nextInt();
        System.out.print("Enter the last value to initalize loop: ");
        int val_2 = sn.nextInt();
        System.out.print("\n");
        System.out.print("Printing using For loop: \n");
        for(int i = val_1; i<=val_2;i++){
            System.out.println(i +" ");
        }
        System.out.print("\n");
        System.out.print("Printing using While loop: \n");
        int loop_var=val_1;
        while(loop_var  <= val_2){
            System.out.println(loop_var +" ");
            loop_var++;
        }


        

    }
}