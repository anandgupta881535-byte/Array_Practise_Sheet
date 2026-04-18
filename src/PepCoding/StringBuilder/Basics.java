package PepCoding.StringBuilder;

public class Basics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0, 'd');//setting character
        System.out.println(sb);

        sb.insert(2, 'y');//insert at place
        System.out.println(sb);

        sb.deleteCharAt(2);//remove
        System.out.println(sb);

        sb.append('g');//append
        System.out.println(sb);

        System.out.println(sb.length());
    }
}




