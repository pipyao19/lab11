import java.util.Arrays;
        import java.util.Scanner;

class Triangle{
    int a, b,c;
    int Exist = 1;
    Triangle(int a, int b, int c){
        if (a+b>c & a+c>b & b+c>a){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else {
            Exist = 0;
            System.out.println(" Такого треугольника не существует");

        }
    }
    int perimeter(){
        return a+b+c;
    }
    double square(){
        double p = ((double) a + (double) b + (double) c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

