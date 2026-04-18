package ExceptionHandlingClass;

public class NullPointerExceptionEx2 {
    public static void main(String[] args) {
        String ptr = null;
        try{
            if(ptr.equals("PPP"))
                System.out.println("Same");
            else
                System.out.println("Not Same");

        }catch(NullPointerException e){
            System.out.println("NullPointerException Caught");
        }
    }
}
