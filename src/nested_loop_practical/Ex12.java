package nested_loop_practical;

public class Ex12 {
    public static void main(String[] args) {
        int iTemp=1, jTemp;
        for (int i=1;i<=4;i++){
          for (int j=1; j<=i;j++){
              if ((i+j)%2==0)
                  System.out.print("1 ");
              else
                  System.out.print("0 ");
          }
            System.out.println();
        }
    }
}
