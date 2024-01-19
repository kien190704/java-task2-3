public class Cylinder1 extends Circle1 {
    public double h; 
    public Cylinder1(double r, double h){
        super(r);
        this.h = h; 
    }
    public String GetName(){
        return " Cylinder";
    }
    public double CalArea(){
        return 2 * r * (h + r) * 3.14;
    }
    public double CalVol(){
        return r * 3.14 * r  * h;
    }
}
