package StringHandlingPracticle;

import java.util.Scanner;

public class Ex3 {
    /* count the number of :
    a vowels
    b consonants
    c digits
    d special character
    in giver string .Finally print it
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int v=0, c=0, d=0, spc=0;


            String strcpy = "AEIOUaeiou";
            char [] charArr = str.toCharArray();/*here str is converting into charArray();*/
            for(char ch : charArr){
            if (Character.isDigit(ch)){
                d++;
            }else if(Character.isLetter(ch)) {
                if (strcpy.contains(ch + "")) {
                    v++;
                } else {
                    c++;
                }
            }
                else if(ch!=' '){
                    spc++;
                }
            }


        System.out.println("numbers of vowels is: "+v);
        System.out.println("numbers of consonants is: "+c);
        System.out.println("numbers of digit is: "+d);
        System.out.println("numbers of Special characters is: "+spc);
    }
}/* convert string into charAt[]
 wrapper class have some method like isDigit() and isLetter()*/
