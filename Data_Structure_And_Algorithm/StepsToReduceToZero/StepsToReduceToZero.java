package StepsToReduceToZero;

public class StepsToReduceToZero {
    public static void main(String[] args) {
        int steps  = numberOfSteps(14,0);
        System.out.println(steps);
    }

    static int numberOfSteps(int number, int steps){
        if (number==0){
            return steps;
        }
        if (number%2 != 0){
            return  numberOfSteps(--number,++steps);
        }
        return numberOfSteps(number/2, ++steps);
    }
}
