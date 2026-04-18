package ColledtionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TypeSafeEx2 {
    public static void main(String[] args) {
        List<String> artistList = new ArrayList<String>();
        Scanner kb = new Scanner(System.in);
        while(true){
            System.out.println("Enter your favourite actor (to stop type stop)");
            String str = kb.next();
            if(str.equals("stop")){
                break;
            }
            artistList.add(str);
            System.out.println("Your favourites");
            for(String act:artistList){
                System.out.println(act);
            }
        }
    }
}
