package Topshiriq_4;

public class Top4_Main {
    public static void main(String[] args) {
        Shape shape=new Kvadrat(5);
        System.out.println("shape.getPerimetr() = " + shape.getPerimetr());
        System.out.println("shape.getSquare() = " + shape.getSquare());
        Shape shape1=new Triangle(3,4,5);
        System.out.println("shape1.getPerimetr() = " + shape1.getPerimetr());
        System.out.println("shape1.getSquare() = " + shape1.getSquare());
        Shape shape2=new Kvadrat(19.5);
        System.out.println("shape2.getPerimetr() = " + shape2.getPerimetr());
        System.out.println("shape2.getSquare() = " + shape2.getSquare());


        Kvadrat kvadrat=new Kvadrat(5);
        Kvadrat kvadrat1=new Kvadrat(10);

    }
}
