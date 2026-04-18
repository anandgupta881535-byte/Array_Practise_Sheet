package ExceptionHandlingClass;

public class InvalidLoginException extends Exception{
 InvalidLoginException(String msg){
     super(msg);
 }
}
class Login{
    public static void main(String[] args) {
        String user = "admin";
        String pass = "1234";
        try{
            if(!user.equals("admin")||!pass.equals("admin123")){
                throw new InvalidLoginException("Invalid Login Detils");

            }
            System.out.println("Login Successful");

        }catch(InvalidLoginException e){
            System.out.println(e.getMessage());
        }
    }
}
