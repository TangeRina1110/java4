package Asem4.h7.flyweight;

public class Point implements Shape{

    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+", "+y+"): рисуем точку");
    }
}
