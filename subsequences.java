import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		subseqences(s,"");
    }
	public static void subseqences(String s,String res){
		if(s.length()==0){
			System.out.print(res+" ");
			i++;
			return ;
		}

		subseqences(s.substring(1),res);
		subseqences(s.substring(1),res+s.charAt(0));
	}
}
