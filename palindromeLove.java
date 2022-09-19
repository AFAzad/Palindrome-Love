import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int i=0;
		int j=s1.length()-1;
		int count=0;
		while(i<j){
			if(s1.charAt(i)!=s1.charAt(j))
				count++;
			i++;
			j--;

		}
		System.out.println(count);
	}
}