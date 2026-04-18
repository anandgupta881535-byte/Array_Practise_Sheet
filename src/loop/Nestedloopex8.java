package loop;

public class Nestedloopex8 {
    public static void main(String[] args) {
        for (int i=4;i<=1;i--){
            for (int j=i;j<=i;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
