package Recusion_Assignment;
public class print_subset_sum_to_k {
	public static void printSubsetsSumTok(int input[], int k) {
		 int[] output=new int[0];
        printSubsetsSumTok(input, k, 0,output);

    }

    public static void printSubsetsSumTok(int[] input, int k, int start,int[] output) {
        if (start == input.length) {
            if (k == 0) {
                for (int i : output) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            }
            else {
                return;
            }

        }
        int[] newoutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++) {
            newoutput[i] = output[i];

        }
        newoutput[i] = input[start];
        printSubsetsSumTok(input, k, start + 1, output);
        printSubsetsSumTok(input, k-input[start], start+1, newoutput);

		
	}
}
