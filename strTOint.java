import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(printInteger(s));
    }
	public static int printInteger(String s){
		if(s.length()==0)
			return 0;
		int a=(s.charAt(0)-'0')*(int)Math.pow(10,(s.length()-1));
		return a+printInteger(s.substring(1));
	}
}
