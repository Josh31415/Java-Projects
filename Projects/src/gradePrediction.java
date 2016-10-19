import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class gradePrediction extends Matrix{
	int inputLayerSize = 2;
	int hiddenLayerSize = 4;
	int outputLayerSize = 1;
	static float[][] net = new float[4][4];
	static float[][] col = new float[4][1];
	//static float[][] col2 = new float[4][1];
	//static float[][] col3 = new float[4][1];
	//static float[][] col4 = new float[4][1];
	float finRes;
	int w = 1;
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
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
		float  [][] w1 = {{1,1}};
		float[][] w2 = {{1,1,1,1}};
		float[][] w3 = {{1,1,1,1}};
		float[][] w4 = {{1,1,1,1}};
		float[][] add = new float[4][1];
		float ran = 0;
				
		for(int f = 0; f < net.length; f++){
			net[f][0] = i[0][f] * w1[f][0];
			Math.tanh(net[f][0]);
		}
		
		for(int dd = 0; dd < net[0].length; dd++){
			for(int z = 0; z < net[0].length; z++){
				for(int x = 0; x < col[0].length; x++){
					net[dd][x] = col[x][0];
				}
				for(int y = 0; y < col[0].length; y++){
					col[y][0] = multiplyM(col,w2);
					ran = add[0][0] + add[1][0] + add[2][0] + add[3][0];
				}
				net[dd + 1][z] = (float) Math.tanh(ran);
			}
		}
		
		//float[][] m1 = multiplyM(i,w1);
		//System.out.println(m1[0][0]);
	}

}
