import java.util.Scanner;
import java.util.Arrays;

        class Arrays1 {
    int[] arr;
    int n;
    Arrays1(int n){
        this.n=n;
        arr = new int[n];
    }
    void inputArr(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            this.arr[i]= sc.nextInt();
        }
    }
    void outputArr(){
        for (int value : arr) {
            System.out.println(value);
        }
    }
    void sortArr1(){
        Arrays1.sort(arr);
    }
    void sortArr2(){
        Arrays1.sort(arr);
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int rab = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = rab;
                }
            }
        }
    }
}



