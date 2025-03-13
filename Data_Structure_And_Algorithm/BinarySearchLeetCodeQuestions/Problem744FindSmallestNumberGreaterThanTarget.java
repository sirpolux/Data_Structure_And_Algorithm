package BinarySearchLeetCodeQuestions;

public class Problem744FindSmallestNumberGreaterThanTarget {
    public static void main(String[] args) {
        //Input: letters = ["c","f","j"], target = "a"
        char[] letters = {'c', 'f', 'j'};
        System.out.println("Answer: " + nextGreatestLetter(letters, 'c'));
        System.out.println("Answer: " + nextGreatestLetter(letters, 'k'));
        System.out.println("Answer: " + nextGreatestLetter(letters, 'f'));
    }
    private static char nextGreatestLetter(char[] letters, char target){
        int start=0;
        int end=letters.length-1;
        while (start<=end){
            int mid = start + ((end-start)/2);
            if (target<letters[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        System.out.println("Start: "+ start);
        return letters[start%(letters.length)];

    }
}
