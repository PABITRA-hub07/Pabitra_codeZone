class FindSecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 13, 5, 17, 26};
        int Largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>Largest) {
                SecondLargest=Largest;
                Largest=arr[i];

            }
        }
        System.out.println("The Second Largest Element is :"+SecondLargest);
       }
}