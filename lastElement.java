import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		System.out.println(lastIndex(arr,m,0));
    }
	public static int lastIndex(int arr[],int m,int i){
		if(i==arr.length){
			return -1;
		}
		int a=lastIndex(arr,m,i+1);
		if(a==-1){
			if(arr[i]==m){
				return i;
			}
			return -1;
		}
		return a;
	}
}
