package StringHandlingPracticle;

import java.util.Scanner;

/*check for anagram eg: listen silent*/
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char [] arr = str1.toCharArray();
        int count=0;
        for(char ch: arr){
            if(str2.contains(ch+"")){
                count++;
            }
            else {
                System.out.println("The given string is not anagrams");
                break;
            }
        }
        if(count==str1.length()){
            System.out.println("The given string is an anagrams");
        }
    }
}
/* we can also first short both string and then use equals() to find anagram*/