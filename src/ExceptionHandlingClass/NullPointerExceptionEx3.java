package ExceptionHandlingClass;

public class NullPointerExceptionEx3 {
    public static void main(String[] args) {
        String str = null;
        String msg = (str == null)? "null value": str.concat("JTP");
        System.out.println(msg);
        str = "Java";
        msg = (str == null)? "null value": str.concat("JTP");
        System.out.println(msg);
    }
}
