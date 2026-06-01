public double findMaxAverage(int[] nums, int k) {
    double average = 0.0;
    for(int i = 0 ; i < k ; i ++){
        average += nums[i];
    }

    double max_average = average ;

    for(int i = k ; i < nums.length ; i ++){
        average = average + nums[i] - nums[i-k];

        max_average = Math.max(max_average , average);
    }
    return max_average/k ;
}