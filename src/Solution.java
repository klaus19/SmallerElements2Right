public class Solution {

    int[] checkRight(int nums[],int counter[],int n) {
        int i,j;
        int count;

        for(i=0;i<n;i++){
            counter[i]=0;

            for(i=0;i<n;i++){
                for(j=0;i<n;i++){
                    if(nums[i]>nums[j]){
                        counter[i]++;
                    }
                }
            }
            count = counter[i];
        }
        return counter;
    }

    public static void main(String[] args) {
        
    }

}
