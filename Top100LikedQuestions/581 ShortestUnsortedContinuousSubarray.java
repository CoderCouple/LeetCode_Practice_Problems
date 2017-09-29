package Top100LikedQuestions;

public class ShortestUnsortedContinuousSubarray {
	
       
	public static int findUnsortedSubarray(int[] nums) {

              
      if(nums.length==1)
			return 0;
        
		boolean isMinBreakfound = false;
		boolean isMaxBreakfound = false;
        int minBreakIndex = 0;
		int maxBreakIndex = nums.length - 1;
    
            
            
    
         	 if(nums[0]>nums[nums.length-1])
	        	return nums.length;
    
		for (int i = 0; i <nums.length-1; i++) {
				if (nums[i] > nums[i + 1]) {
					minBreakIndex = i;
					break;
				}			
		}

        for (int j = nums.length-1; j >0; j--) {
				if (nums[j] < nums[j-1]) {
					maxBreakIndex = j;
					break;
				}			
		}
    
         System.out.println("minBreakIndex"+minBreakIndex);
         System.out.println("maxBreakIndex"+maxBreakIndex);
        
        
		int min = nums[minBreakIndex];
		int max = nums[minBreakIndex];
    
    
    for (int i = minBreakIndex + 1; i <= maxBreakIndex; i++) {
			if (nums[i] < min)
				min = nums[i];

			if (nums[i] > max)
				max = nums[i];
		}

        System.out.println("min"+min);
        System.out.println("max"+max);
        
        
		int startIndex = 0;
		int endIndex = nums.length - 1;
		for (int k = 0; k <= minBreakIndex; k++) {
			if (nums[k] > min) {
				startIndex = k;
				break;
			}

		}

		for (int l = nums.length-1; l>=0;l--) {
			if (nums[l] < max) {
				endIndex = l;
				break;
			}
		}
		
        System.out.println("startIndex"+startIndex);
        System.out.println("endIndex"+endIndex);
    
          if(minBreakIndex==0 && maxBreakIndex==nums.length-1 )
	     	return 0;
        
		return endIndex - startIndex+1;
	}


	public static void main(String[] args) {
		int array[] ={1,2,3,4};
		System.out.println(findUnsortedSubarray(array));

	}

}
