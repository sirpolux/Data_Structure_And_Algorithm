package NumberOfZeros;

public class NumberOfZeros{
    public static void main(String[] args) {
        int number = 730405003;
        int zeros = noOfZeros(number,0);
        System.out.println(zeros);
    }

    static int noOfZeros(int number, int count){
        if (number<9){
                if (number==0){
                    count++;
                }
                return  count;
        }
        if (number%10==0){
            count++;
            return noOfZeros(number/10, count);
        }
        return noOfZeros(number/10, count);
    }
}

