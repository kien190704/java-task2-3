public class Circle1 extends Shape1{
    public double r;
    public Circle1(double r){
        this.r = r;
    }
    public String GetName(){
        return "Cirlce";
    }
    public double CalArea(){
        return r * r * 3.14;
    }
    public double CalVol(){
        return 0.0;
    }
}
