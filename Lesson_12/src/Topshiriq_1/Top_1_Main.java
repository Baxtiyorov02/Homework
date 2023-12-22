package Topshiriq_1;

import Topshiriq_1.Topshiriq_1_UseAbstract.Circle;
import Topshiriq_1.Topshiriq_1_UseAbstract.Rectangle;
import Topshiriq_1.Topshiriq_1_UseAbstract.Shape;

public class Top_1_Main {
    public static void main(String[] args) {
        Shape rectangle= new Rectangle(156,65);
        Shape circle=new Circle(23);
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getSideCount());

    }




}
