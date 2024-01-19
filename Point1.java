public class Point1 extends Shape1 {
    private double a;
    private double b;
    public Point1(double a, double b){
        this.a = a;
        this.b = b;
    }
    public String GetName(){
        return "Point";
    }
    public double CalArea(){
        return 0.0;
    }
    public double CalVol(){
        return 0.0;
    }
}
