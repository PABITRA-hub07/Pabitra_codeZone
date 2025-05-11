import java.util.*;
public class rightRotateByKposition {
    //Method to nreverse between indices start and end
    public static void reverse(int[] array,int start,int end) {
        while (start<end) {
            int temp=array[start];
                 array[start]=array[end];
                 array[end]=temp;
                 start++;
                 end--;
        }
    }
    public static void reversePosition(int[] array,int k) {
        int n=array.length;
       k = k % n; //in case of k>n
       reverse(array, 0, n-1); 
       /*
        firstly we reverse the whole array
        suppose the array is [1, 2, 3, 4, 5] becomes [5, 4, 3, 2, 1]
        */
       reverse(array, 0, k-1);
       /*
        in second reverse we reverse the first k elements
        Example for k=2: [5, 4, 3, 2, 1] -> [4, 5, 3, 2, 1] 
        */
       reverse(array,k, n-1);
       /*
        in last we reverse the rest all elements
        Example: [4, 5, 3, 2, 1] -> [4, 5, 1, 2, 3] 
        */
       for (int num : array) {//prints the final array
        System.out.print(num+" ");
       }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many elements you have to enter in the array :");
    int element=sc.nextInt();
    System.out.println("Enter the elements :");
    int[] array=new int[element];
    for(int i=0;i<element;i++) {
      array[i]=sc.nextInt();
    }
    System.out.println("Enter the k-th position :");
    int k=sc.nextInt();
    reversePosition(array, k);
     sc.close();
    }
}
