/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
*/

public int maxProduct(int[] arr) {
	if(arr == null || arr.length == 0)
		return 0;

	int curMin = arr[0];
	int curMax = arr[0];
	int result = arr[0];
	for(int i = 1; i < arr.length; i++) {

		if(arr[i] < 0) {
			int temp = curMax;
			curMax = curMin;
			curMin = temp;
		}

		curMax = Math.max(arr[i], arr[i] * curMax);
		curMin = Math.min(arr[i], arr[i] * curMin);
		result = Math.max(result, curMax);
	}
	return result;

}