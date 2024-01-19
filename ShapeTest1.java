public class ShapeTest1 {
    public static void main(String[] args){
        Shape1[] a =  new Shape1[3];
        a[0] = new Point1(1, 2);
        a[1] = new Circle1(5);
        a[2] = new Cylinder1(6, 7);
        for ( int i = 0; i < a.length; i ++){
            System.out.println("the shape is: " + a[i].GetName());
            System.out.println("the area is: " + a[i].CalArea());
            System.out.println("the volume  is: " + a[i].CalVol());
        }
    }
}
