package Recusion_Assignment;
public class return_subset_of_array {
	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your 

		return subsets( input,0);

	}
    public static int[][] subsets(int input[],int startindex){
        if(startindex==input.length){
            return new int[1][0];
            
        }
        //obtain ans from the next index elments 
        int temp[][]=subsets(input,startindex+1);
        //now in the final ans in the half put element at index startindex 
        //and in other half donot
        int output[][]=new int[2*temp.length][];
        // in the first half donot put elements at startindex
        int k=0;
        
        for(int i=0;i<temp.length;i++){
            output[k]=new int[temp[i].length];
            for(int j=0;j<temp[i].length;j++){
            output[k][j]=temp[i][j];
                }
            k++;
        }
        // in the second half put elements at startindex
        for(int i=0;i<temp.length;i++){
            output[k]=new int[temp[i].length+1];
            output[k][0]=input[startindex];
            for(int j=0;j<temp[i].length;j++){
                output[k][j+1]=temp[i][j];
                
            }
            k++;
        }
    
          return output;
    }
}

