import java.util.*;
class leftRotateByKposition {
  //method to reverse between indices start and end
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
      k = k % n; //to handle if k>n cases
      reverse(array, 0, k-1);
      /*
       first reverse o to 1 means first two elements [1, 2] to [2, 1]
       So if the array is[1, 2, 3, 4, 5] becomes-[2, 1, 3, 4, 5]
       */
      reverse(array, k, n-1);
      /*
       second reverse k to (n-1) means rest all [3, 4, 5] to [5, 4, 3]
       so the array becomes [2, 1, 5, 4, 3]
       */
      reverse(array, 0, n-1); 
      //Now we reverse the whole array i.e [2, 1, 5, 4, 3] to [3, 4, 5, 1, 2]
      for (int num : array) { //Now we have to print the final reversed array we got using for-each loop
         System.out.print(num+" ");
      }
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("How many elements you want to enter :");
     int element=sc.nextInt();
     int[] array=new int[element];
     System.out.println("Enter the elements :");
     for (int i = 0; i < element; i++) {
      array[i]=sc.nextInt();
     }
     System.out.println("Enter the k-th position for rotation :");
     int k=sc.nextInt();
     reversePosition(array, k); //calling the function
     sc.close();
    }
}