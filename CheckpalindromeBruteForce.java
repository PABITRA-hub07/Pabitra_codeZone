class CheckpalindromeBruteForce {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int First=0;
        int Last=arr.length-1;
        while(First<Last){
           if (arr[First]!=arr[Last])  {
            System.out.println("It is not palindrome."); 
            return;
           }
           First++;
           Last--;
        }
            System.out.println("It is palindrome.");
    
    }
}