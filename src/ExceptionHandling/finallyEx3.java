package ExceptionHandling;

public class finallyEx3 {
    public static void main(String[] args) {
        try{
            System.out.println("First statement of try block");
            int num = 45/0;
            System.out.println(num);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }finally {
            System.out.println("Finally block");
        }
        System.out.println("out of try-catch-finally block");
    }

}
