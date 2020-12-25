import java.util.Arrays;
        import java.util.Scanner;

        class Rectangle{
    int a,b;
    Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }
    public String getAandB() {
        return a+" " + b;
    }

    int perimeter(){
        return 2*a+2*b;
    }
    int square(){
        return a*b;
    }
}

