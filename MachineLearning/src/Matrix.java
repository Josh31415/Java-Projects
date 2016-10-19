import java.io.IOException;


public class Matrix {
	public static float multiplyM(float[][] FM, float[][] SM) throws IOException{
		int Frows = FM[0].length;
		int Fcolumns = FM.length;
		int Srows = SM[0].length;
		int Scolumns = SM.length;

		//float finAns[][] = new float[Frows][Scolumns];

		float finans = 1.0f;
		if (Fcolumns != Srows){
			System.out.println("ERROR!!!");
		}

		//compute matrix
		for (int dd = 0; dd < Frows; dd++){

			//compute row in matrix
			for (int z = 0; z < Scolumns; z++){

				//compute element in matrix
				for (int i = 0; i < Fcolumns ; i++){

					finans += FM[i][dd] * SM[z][i];

				}//end of for 1
			}//end of for 2
		}//end of for 3
		//float finalAns = finans[0][0];
		return finans;

	}
}
