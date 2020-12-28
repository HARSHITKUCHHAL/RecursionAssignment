package Recusion_Assignment;
public class return_subset_sum_to_k {
	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		return subsetSumHelper(input, 0, k);
	}
    
    public static int[][] subsetSumHelper(int input[], int si, int k) {
        if (si == input.length) {
            if (k == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }
        
        int smallOutput1 [][] =  subsetSumHelper(input, si+1, k);
        int smallOutput2 [][] = subsetSumHelper(input, si+1, k - input[si]);
        int output [][] = new int[smallOutput1.length + smallOutput2.length][];
        
        int index = 0;
        for (int i=0; i<smallOutput1.length; i++) {
            output[index++] = smallOutput1[i];
        }
        
        for (int i=0; i<smallOutput2.length; i++) {
            output[index] = new int[smallOutput2[i].length + 1];
            output[index][0] = input[si];
            for (int j=0; j<smallOutput2[i].length; j++) {
                output[index][j + 1] = smallOutput2[i][j];
            }
            index++;
        }
        
        return output;
    }
}
