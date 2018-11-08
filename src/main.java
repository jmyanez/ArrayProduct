import java.util.Arrays;

public class main {
    public static void main (String[] args){
        int[] nums = {1,2,3,4};

        /*int[] array = {1,2,3,4};
        int[] total = new int[array.length];
        Arrays.fill(total,1);
        for(int i = 0;i<array.length;i++){
            for(int j =0; j<array.length;j++){
                if(i==j){
                    total[i]*=1;
                }
                else{
                    total[i]*=array[j];
                }
            }
        }
        for(int k = 0;k<=total.length-1;k++){
            System.out.println(total[k]);
        }
        */
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;

        for(int i = 1;i<nums.length;i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[right.length-1]= 1;
        for(int j = nums.length-2 ; j>=0;j--){
            right[j] = right[j+1] * nums[j+1];
        }

        int[] product = new int[nums.length];
        for(int k =0 ; k < nums.length;k++){
            product[k] = left[k] * right[k];
        }
       // return product;
    }

}
