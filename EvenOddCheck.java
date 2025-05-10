public class EvenOddCheck {
    public static void main(String[] args) {
        int[] arr={12, 13, 18, 111, 37, 1};
        int EvenCount=0;
        int OddCount=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                EvenCount++;
            }
            else {
                OddCount++;
            }
        }
        System.out.println("There are "+EvenCount+" Even numbers in the array.");
        System.out.println("There are "+OddCount+" Odd numbers in the array.");
    }
}
