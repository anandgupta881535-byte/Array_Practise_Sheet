package ExceptionHandling;

public class finally2Ex {
    public static void main(String[] args) {
        System.out.println(finally2Ex.myMethod());
    }
    public static int myMethod(){
        try{
            return 112;

        }finally {
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}
