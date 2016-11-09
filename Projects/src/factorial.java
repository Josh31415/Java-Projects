import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial {
	static int ans = 0;
	public static int findFactorial(int x){
		
		if(x == 0){
			return 1;
		}
		else{
			return x * findFactorial(x - 1);
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		String ans = br.readLine();
		int x = Integer.parseInt(ans);
		int finAns = findFactorial(x);
		
		System.out.println(x + " factorial equals " + finAns);
		
	}
}
