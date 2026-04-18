package ExceptionHandlingClass;

public class NumberFormatExceptionEX2 {
    private static final String inputString = "123.33";
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(inputString);
        }catch (NumberFormatException e){
            System.out.println("Given input is not a number.");
        }
    }
}
