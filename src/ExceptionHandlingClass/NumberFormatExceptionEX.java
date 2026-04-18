package ExceptionHandlingClass;

public class NumberFormatExceptionEX {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(null);
        }catch (NumberFormatException e){
            System.out.println("Given input is not a number.");
        }
    }
}
