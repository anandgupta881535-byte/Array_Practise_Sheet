package ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
       try {
            //try main
           try {
               //try block 2
               try {
                   //try block 3
                   int arr[] = {1, 2, 3, 4};
                   System.out.println(arr[10]);
               } catch (ArithmeticException e) {
                   System.out.println("Arithmetic Exceptio");
                   System.out.println("Handled in try-block3");
               }
           } catch (ArithmeticException e) {
               System.out.println("Arithmetic Exceptio");
               System.out.println("Handled in try-block2");
           }
       }catch(ArithmeticException e){
           System.out.println("Arithmetic Exceptio");
           System.out.println("Handled in try-block main");
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array Index Out Of Bound Exception Found");
           System.out.println("Handled in try-block main");
       } catch (Exception e) {
           System.out.println("exception found");
           System.out.println("Handled by main");
       }
    }
}
