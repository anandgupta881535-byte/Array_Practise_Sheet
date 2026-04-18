package PepCoding;

public class checkingStringNumber {
    public static void main(String[] args) {
        int x=10, y=20;
        System.out.println("Good"+(x+y));
        System.out.println("Good"+x+y);
        System.out.println(x+"Good"+y);
        System.out.println(x+y+"Good");//print java left to right karta hai.
        System.out.println(10-20+"Good");
        System.out.println("Good"+10+20);//only + operator are overloaded so we not use -.
    }
}
