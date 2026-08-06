package SlidingWindow;

public class Max_consecutive_ones {

    public static void main(String[] args) {

       int[] arr = {1, 0, 0, 1, 1, 1, 0, 1, 1};
        int count = 0;
        int maxCount = 0;

        for(int i = 0 ;i < arr.length; i++){
            if(i == arr.length -1 && arr[i] == 1){
               count++;
                maxCount = Math.max(maxCount, count);
            }
            else if(arr[i] == 1 && i != arr.length -1) count++;
            else{
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        System.out.println("Total consecutive ones  are " + maxCount);
    }
    
}
