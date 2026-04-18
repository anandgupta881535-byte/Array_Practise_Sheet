package CallingGC;

public class UseCallingGC {

    public static void main(String[] args) {
        CallingGC emp1 = new CallingGC( 24 , "Anil" , 50000.0);
        CallingGC emp2 = new CallingGC(30 , "Sumit", 34000.5);
        CallingGC emp3 = new CallingGC(29 , "Akash", 40000.8);
        {
            CallingGC emp4 = new CallingGC(19 , "Mayank", 24000.5);
            CallingGC emp5 = new CallingGC(18 , "Rahul", 18000.8);
             emp1.showCount();
            emp3=emp4=null;
            System.gc();
            System.runFinalization();
        }

        emp1.showCount();
    }

}
