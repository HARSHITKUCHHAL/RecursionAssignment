package Recusion_Assignment;
public class return_all_codes {
	public static char code(int i) {
            if(i<=26)
		return (char) (i +'a' -1);
            else
		return 'A';
	}
	
	public static  String[] getCode(String str){
            if(str.length() == 0) {
		String ans[] = {""};
		return ans;
            }
            int c1 = str.charAt(0)- '0';
		if(str.length() == 1) {
                    char c= code(c1);
                    String ans[] = {""};
                    ans[0]= ans[0] + c;
                    return ans;
		}
		else {
                    int c2 = str.charAt(1) - '0';
                    int com  =c1*10 + c2;
                    if(com<=26) {
			char cc= code(c1);
			char cd = code(com);
			String smallans1[] =  getCode(str.substring(1));
			String smallans2[] =  getCode(str.substring(2));
			String ans[] = new String[smallans1.length + smallans2.length];
			for(int i = 0; i<smallans1.length; i++) {
                            ans[i] = cc + smallans1[i];
			}
			for(int i = 0; i<smallans2.length; i++) {
                            ans[i + smallans1.length] = cd + smallans2[i];
			}	
			return ans;
		}
		else {
                    char c= code(c1);
                    String smallans[] =  getCode(str.substring(1));
                    String ans[] = new String[smallans.length];
                    for(int i = 0; i<ans.length; i++) {
                        ans[i] = c + smallans[i];
                    }
                    return ans;
		}
	}
    }
}
