package Recursion;

public class FiboRev {

    public static void main(String[] args) {
        int sum = fibo(6);
        System.out.println(sum);
    }


    static int fibo(int num){
        if (num<2)
            return  num;
        return fibo(num-1) + fibo(num-2);
    }


}
