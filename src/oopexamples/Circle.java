package oopexamples;

public class Circle {
    private int radius;

    public void setRadius(int rad){
        radius=rad;
    }
    public void calArea(){
        double area;
        area = Math.PI*Math.pow(radius,2);
        System.out.println("Area of circle is:"+area);
    }
    public void calCircumference(){
        double circu;
        circu = 2*Math.PI*radius;
        System.out.println("Circumference of circle is:"+circu);

    }
}
