import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Caculator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true){
		String f1 = br.readLine();
		if (f1.length() == 0){
			continue;
		}
		String delims = " ";
		String[] tokens = f1.split(delims);
		int[] i;
		double i1 = Integer.parseInt(tokens[0]);
		double i2 = Integer.parseInt(tokens[2]);
		double ans;
		int a;
		int b;
		
			if(tokens[1].equals("+")){
				ans = i1 + i2;
				System.out.println(ans);
			}
			else if(tokens[1].equals("-")){
				ans = i1 - i2;
				System.out.println(ans);
			}
			else if(tokens[1].equals("*")){
				ans = i1 * i2;
				System.out.println(ans);
			}
			else if(tokens[1].equals("/")){
				ans = i1 / i2;
				System.out.println(ans);
			}
			else if(tokens[1].equals("^")){
				a =(int)i1;
				b =(int)i2;
				ans = (float) Math.pow(a,b);
				System.out.println(ans);
			}
			else{
				System.err.println("Incorrect Entry");
				break;
			}
			System.out.println("\n");
		}
	}
}
