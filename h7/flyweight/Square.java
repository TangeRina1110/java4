package Asem4.h7.flyweight;

public class Square implements Shape{
    @Override
    public void draw(int x, int y) {
        int a = 10;
        System.out.println("("+x+", "+y+"): рисуем квадрат со стороной" + a);
    }
}

