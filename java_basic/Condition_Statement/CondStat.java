import java.util.Scanner;

public class CondStat{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter 1 to Print Monday !!\n");
        System.out.print("Enter 2 to Print Tuesday !!\n");
        System.out.print("Type anything to exit Program!!");
        System.out.print("\n");
        int var = sn.nextInt();
        System.out.print("\n");
        System.out.print("Code executed using if , else if and else: \n");
        if(var == 1){
            System.out.print("Monday");
        }
        else if(var == 2){
            System.out.print("Tuesday");
        }
        else{
            System.out.print("Exit!!");
        }
        System.out.print("\n");
        System.out.print("Code executed using switch: \n");
        switch(var){
            case 1:
            System.out.print("Monday");
            break;
            case 2:
            System.out.print("Tuesday");
            break;
            default:
            System.out.print("Exit!!");
        }
    }
}