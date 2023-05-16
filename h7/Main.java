package Asem4.h7;

import Asem4.h7.Proxy.ProxyImage;
import Asem4.h7.Proxy.RealImage;
import Asem4.h7.Proxy.Image;
import Asem4.h7.flyweight.ShapeFactory;
import Asem4.h7.flyweight.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Image image = new RealImage("C:/images/photo.jpg");
        image.display();
        Image image1 = new ProxyImage("C:/images/photo2.jpg");
        image1.display();


        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("круг"));

        Random rand = new Random();
        for (Shape shape : shapes){
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            shape.draw(x, y);
        }
    }
}
