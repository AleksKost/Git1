//Написать программу, которая будет высчитывать периметр, площадь, для заданного прямоугольника.

public class Main{
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int s = a*b;
        System.out.println("Площадь равна: " + s);
        int p = 2 * (a+b);
        System.out.println("Периметр равен: " + p);
    }

}