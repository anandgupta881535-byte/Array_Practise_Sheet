package nested_loop_practical;

public class Ex15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }

                for (int k = 1; k <= i; k++){
                    if (k==1 || k==i || i==4){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
    }
}
