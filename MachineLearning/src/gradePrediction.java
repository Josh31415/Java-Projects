import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class gradePrediction extends Matrix{

	//static float[][] col2 = new float[4][1];
	//static float[][] col3 = new float[4][1];
	//static float[][] col4 = new float[4][1];


	public static void main(String[] args) throws IOException{
		float[][] net = new float[4][4];
		float[][] col = new float[4][1];
		float  [][] w1 = {{1f,0.5f}};
		float[][] w2 = {{0.3f,0.5f,0.1f,1f}};
		float[][] w3 = {{1f,0.5f,1f,1f}};
		float[][] w4 = {{0.5f,1f,0.55f,0.4f}};
		float finRes;
		float ran = 0;
		int w = 1;	


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How long did you study ");
		String sinput;
		sinput = reader.readLine();
		float intput1 = Integer.parseInt(sinput);



		System.out.println("How long did you sleep ");
		String sinput2;
		sinput2 = reader.readLine();
		int intput2 = Integer.parseInt(sinput2);
		float [][] i = {{intput1},{intput2}};
		float res1;
		float res = 0;

		res1 = multiplyM(i,w1);
		res1 = (float) Math.tanh(res1);

		for(int f = 0; f < net.length; f++){
			net[f][0] = res1;
		}

		for(int dd = 1; dd < net.length; dd++){

			for(int x = 0; x < col.length; x++){
				col[x][0] = net[x][dd - 1];
			}

			for(int z = 0; z < net[0].length; z++){
				if(dd == 1){
					res = multiplyM(col,w2);
				}
				else if(dd == 2){
					res = multiplyM(col,w3);
				}
				else if(dd == 3){
					res = multiplyM(col,w4);
				}
				//res = multiplyM(col,w2);
				res = (float) Math.tanh(res);
				net[z][dd] = res;
			}
		}

		float finans = net[0][3]  + net[1][3] + net[2][3] + net[3][3];
		finans = finans/4;
		finans = finans * 100.0f;
		System.out.println("You will get a " + finans + "% on the assignment");
		//float[][] m1 = multiplyM(i,w1);
		//System.out.println(m1[0][0]);
	}

}
