package leetCode.arrays;

public class MaxArea {
    public int maxArea(int [] arr){
        int max = 0;
        int i = 0;
        int j = arr.length-1;

        while (i < j){

            int newArea = Math.min(arr[i],arr[j]) * (j-i);
            if(arr[i] < arr[j]) i++;
            else j--;

            if (newArea > max) max = newArea;

        }

        return max;

    }
}
