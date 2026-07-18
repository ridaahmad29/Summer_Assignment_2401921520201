public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int i;
    int j;
    int n = nums1.length ;
    int[] arr= new int[n];
    for(i = 0 ; i< nums1.length ; i ++){
        for(j=0 ; j < nums2.length ; j ++){
            if(nums1[i]==nums2[j]){
                int nextGreater = -1;
                for (int k = j + 1; k < nums2.length; k++) {
                    if (nums2[k] > nums2[j]) {
                        nextGreater = nums2[k];
                        break;
                    }
                }
                arr[i] = nextGreater;
                break;
            }

        }
    }
    return arr;
}