package loop;

import java.util.Scanner;

public class AddNos {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a,b;
        String choice;
        do{
            System.out.println("Enter 2 int");
            a = kb.nextInt();
            b = kb.nextInt();
            System.out.println("Sum is "+(a+b));
            System.out.println("Do you want to repate (yes/no) ?");
            kb.nextLine();//this is special buffering condition occur in buffer memory while we press "enter Key" from
            choice = kb.nextLine();
        }while(choice.equalsIgnoreCase("yes"));// if we use == it compare address of object reference choice
    }
}
