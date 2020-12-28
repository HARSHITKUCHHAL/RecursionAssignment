package Recusion_Assignment;
public class stair_case {
	
     public static int staircase(int n){
         if(n==0||n==1)
             return 1;
         if(n<0)
             return 0;
         return staircase(n-1)+staircase(n-2)+staircase(n-3);

	}
	
}