package drill;

public class ProductArrayExceptItself {
    public int[] productArrayExceptItself(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            if(i==0)left[i] = 1;
            else{
                left[i] = left[i-1] * arr[i-1];
            }
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            if(i == arr.length-1) right[i] = 1;
            else {
                right[i] = right[i+1] * arr[i+1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = left[i] * right[i];

        }
        return result;
    }
}
