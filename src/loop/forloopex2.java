package loop;

public class forloopex2 {
    public static void main(String[] args) {
        int i = 1;

        for (; ; ) {
            if (i==11)
                break;
            System.out.println(i);
            i++;
        }
    }
}