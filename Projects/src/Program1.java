import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
	
static String calc = "calculator";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello, what do you need?");
		String s1 = br.readLine();
		if (s1.equals("calculator")){
			System.out.println("What would you like to compute");
			
		}
		else if (s1.equals("weather")){
			Weather.main(args);
		}
		else if (s1.equals("time")){
			
		}
		else{
			System.err.println("ERROR!!!");
		}
	}

}
