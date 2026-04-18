package ExceptionHandling;

public class TryCatchDemo {
    public static void main(String [] args){
        try{
            int arr[] = new int[7];
            arr[10] = 10/5;
            System.out.println("last Statement of try block");
        }
        catch (ArithmeticException e){
            System.out.println("You should not divide a number by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit");
        }catch(Exception e){
            System.out.println("Some other Exception");
        }


       /* catch(Exception e){
            System.out.println("Some other Exception");
        }//this situation is known as unreachable catchBlock.
        catch (ArithmeticException e){
            System.out.println("You should not divide a number by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit");
        }*/
        System.out.println("Out of the try catch block");
    }

}
