package Facotoria;

public class Factoria {

    public static void main(String[] args) {
        int val  = factoria(5);
        System.out.println(val);
    }

    static  int factoria(int n){
        if (n<=1){
            return n;
        }
        return n * factoria(n-1);
    }
}
