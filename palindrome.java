package guvi;

public class palindrome {
	public static void main(String[] args){
		int n=345;
		int temp=0;
		int sum=0;
		int x=0;
		temp=n;
		while(n>0){
			x=n%10;
			sum=(sum*10)+x;
			n=n/10;
		
			}
		if(temp==sum){
		  System.out.println("The given number is palindrome:");
		 
		}
		else{
			  System.out.println("The given number is not a palindrome:");
		}
	}

}
