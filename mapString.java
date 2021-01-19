import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		HashMap<Integer,Character> map=new HashMap<Integer,Character>();
		char c='A';
		for(int i=1;i<=26;i++){
			map.put(i,c++);
		}
		String s=sc.nextLine();
		mapped(s,map,"");
    }
	public static void mapped(String s,HashMap<Integer,Character> map,String res){
		if(s.length()==0){
			System.out.println(res);
			return;
		}
		for(int i=1;i<=s.length();i++){
			if(i<=s.length()){
				int a=Integer.parseInt(s.substring(0,i));
				if(a<=26){
					mapped(s.substring(i),map,res+map.get(a));
				}
			}
		}
	}
}
