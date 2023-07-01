public class bitwiseAnd {
    static int maxAndValue(int[] arr,int max){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if ((arr[i] & arr[j]) > max) {
                        max = (arr[i] & arr[j]);
                    }
                }
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 10, 12 };
        System.out.println("Maximum Bitwise And value is: "+maxAndValue(arr, 0));
    }
}