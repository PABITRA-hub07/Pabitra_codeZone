public class leftRotateElements {
    public static void main(String[] args) {
        int[] array={1, 3, 5, 7, 9};
        //the array should be look like [3, 5, 7, 9, 1](left-rotate)
        int start=array[0];
        for (int i = 0; i < array.length-1; i++) { //shifting all elements to the left
           array[i]=array[i+1];
        }
        array[array.length-1]=start; //putting the first element at the end
        //printing all left rotated elements(use for-each loop for clean code)
        /*
         for(int num:array) {
         System.out.print(num+" ");
         }
         */
        for (int i = 0; i < array.length; i++) { 
            System.out.print(array[i]+" ");
        }
    }
}
