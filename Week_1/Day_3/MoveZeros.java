public void moveZeroes(int[] nums) {
    int n = nums.length;
    int j= 0;
    int count=0;
    for(int i = 0 ; i< n ; i ++){
        if(nums[i]==0){
            count++;
        }
        else{
            nums[j]=nums[i];
            j++;
        }
    }
    int k = j;
    while(count>0 && k<n){
        nums[k]=0;
        count--;
        k++;
    }
}