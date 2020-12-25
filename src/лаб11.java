import java.util.Arrays;
import java.util.Scanner;

        public class лаб11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны треугольника");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Triangle qwerty = new Triangle(a,b,c);
        if (qwerty.Exist==1) {
            System.out.println("Периметр " + qwerty.perimeter() + "\n Площадь " + qwerty.square());
        }

        System.out.println("Введите стороны прямоугольника");
        int meowA = sc.nextInt();
        int meowB = sc.nextInt();
        Rectangle meow = new Rectangle(meowA,meowB);
        System.out.println("Длина сторон равна "+ meow.getAandB()+"\n Периметр " + meow.perimeter() + "\n Площадь " + meow.square());

        Arrays1 w = new Arrays1(9);
        System.out.println("Ввод массива ");
        w.inputArr();
        w.sortArr2();
        w.outputArr();

    }
}