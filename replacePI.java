import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-->0){
			String s=sc.nextLine();
			System.out.println(replace(s,0));
		}
    }
	public static String replace(String s,int i){
		if(s.length()-2<i){
			return s;
		}
		if(s.substring(i,i+2).equals("pi")){
			s=s.substring(0,i)+"3.14"+s.substring(i+2);
			return replace(s,i+4);
		}
		else{
			return replace(s,i+1);
		}
	}
}
