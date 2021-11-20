/**
 * @author
 * @Program:
 * @description:
 * @creat:
 **/
public class Main {
    public static void main(String[] args) {
        Shape t=new Triangle(3,4,3,4,5);
        Shape r=new Rectangle(3,4);
        Shape s=new Square(3);
        Shape c=new Circle(4);
        System.out.println(t);
        System.out.println("area"+t.calculateArea()+", perimeter"+t.calculatePerimeter());
        System.out.println(r);
        System.out.println("area"+r.calculateArea()+", perimeter"+r.calculatePerimeter());
        System.out.println(s);
        System.out.println("area"+s.calculateArea()+", perimeter"+s.calculatePerimeter());
        System.out.println(c);
        System.out.println("area"+c.calculateArea()+", perimeter"+c.calculatePerimeter());
    }
}
