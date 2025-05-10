import java.util.*;
class CheckPalindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        boolean isPalindrome=true;
       for (int i = 0; i < arr.length; i++) {
        int temp=stack.pop();
        if (arr[i]!=temp) {
           isPalindrome=false;
           break; 
        }
       }
       if (isPalindrome) {
        System.out.println("It is a palindrome array.");
       }
       else{
        System.out.println("It is not a palindrome array.");
       }
    }
}