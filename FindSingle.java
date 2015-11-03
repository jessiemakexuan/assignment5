package singlenumber;

import java.util.Arrays;

/*find single number*/
public class FindSingle{
	public int singleNumber(int[] nums) throws NumberException {
		//sorted the array
		Arrays.sort(nums);
		//if array length is even, it means this array doesn't have one single number.
		if(nums.length%2==0){
			NumberException ne=new NumberException("Exception:Wrong array");
			throw ne;
		}
		int count=0;//record the number of single numbers
		int singleIndex=0;
		//find single number loop
		for(int i=0;i<nums.length;i=i+2){
			if(i==nums.length-1){   //sometimes single number is at the end of array
				count++;
				singleIndex=i;
				break;
			}
			if(nums[i+1]==nums[i]){
				continue;
			}else{
				count++;
				singleIndex=i;
				i=i-1;               //contiune to find single number
			}
		}
		//count!=1 means there are many single number
		if(count!=1){
			NumberException ne=new NumberException("Exception:wrong input");
			throw ne;
		}else{
			return nums[singleIndex];
		}
	}

	public static void main(String[] args) throws Exception{
		FindSingle fs=new FindSingle();
		int nums[]=new int[]{1,2,2,1,3,4,4};
		try{
			System.out.println("Single number is "+fs.singleNumber(nums));
		}catch(NumberException ne){
			System.out.println(ne.getMessage());
		}
	}
}

//when input is illegal
class NumberException extends Exception {
	public NumberException(String message){
		super(message);
	}
}
