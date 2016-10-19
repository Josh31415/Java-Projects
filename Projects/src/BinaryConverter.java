import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class BinaryConverter {
	int ascii;
	static void wordToBinary(String word){
		for (int i = 0; i < word.length(); i++){
			char c = word.charAt(i);   
			int ascii = (int) c;
			int[] binary;
			binary = new int[8];
			binary[0] = 0;
			binary[1] = 0;
			binary[2] = 0;
			binary[3] = 0;
			binary[4] = 0;
			binary[5] = 0;
			binary[6] = 0;
			binary[7] = 0;
			while (true){
				if (ascii >= 128){
					binary[0] = 1;
					ascii = ascii - 128;
				}
				else if (ascii >= 64){
					binary[1] = 1;
					ascii = ascii - 64;
				}
				else if (ascii >= 32){
					binary[2] = 1;
					ascii = ascii - 32;
				}
				else if (ascii >= 16){
					binary[3] = 1;
					ascii = ascii - 16;
				}
				else if (ascii >= 8){
					binary[4] = 1;
					ascii = ascii - 8;
				}
				else if (ascii >= 4){
					binary[5] = 1;
					ascii = ascii - 4;
				}
				else if (ascii >= 2){
					binary[6] = 1;
					ascii = ascii - 2;
				}
				else if (ascii >= 1){
					binary[7] = 1;
					ascii = ascii - 1;
				}
				else if (ascii == 0){
					for(int c1 =0; c1 < binary.length ; c1++)
						System.out.print(binary[c1]);
					System.out.print(" ");
					//System.out.println(binary[7]+binary[6]+binary[5]+binary[4]+binary[3]+binary[2]+binary[1]+binary[0]);
					break;
				}
			}
		}

		System.out.println("");
		}
		static void letterToBinary(String letter){
			char c = letter.charAt(0);   
			int ascii = (int) c;
			int[] binary;
			binary = new int[8];
			binary[0] = 0;
			binary[1] = 0;
			binary[2] = 0;
			binary[3] = 0;
			binary[4] = 0;
			binary[5] = 0;
			binary[6] = 0;
			binary[7] = 0;
			while (true){
				if (ascii >= 128){
					binary[0] = 1;
					ascii = ascii - 128;
				}
				else if (ascii >= 64){
					binary[1] = 1;
					ascii = ascii - 64;
				}
				else if (ascii >= 32){
					binary[2] = 1;
					ascii = ascii - 32;
				}
				else if (ascii >= 16){
					binary[3] = 1;
					ascii = ascii - 16;
				}
				else if (ascii >= 8){
					binary[4] = 1;
					ascii = ascii - 8;
				}
				else if (ascii >= 4){
					binary[5] = 1;
					ascii = ascii - 4;
				}
				else if (ascii >= 2){
					binary[6] = 1;
					ascii = ascii - 2;
				}
				else if (ascii >= 1){
					binary[7] = 1;
					ascii = ascii - 1;
				}
				else if (ascii == 0){
					for(int i =0; i < binary.length ; i++)
						System.out.print(binary[i]);
					System.out.println("");
					//System.out.println(binary[7]+binary[6]+binary[5]+binary[4]+binary[3]+binary[2]+binary[1]+binary[0]);
					break;
				}
			}
		}
		static void convertToAscii(String letter){
			char c = letter.charAt(0);   
			int ascii = (int) c;
			System.out.println(ascii);
		}
		static void convertFromAscii(int num){
			StringBuilder builder = new StringBuilder();
			String aChar = new Character((char) num).toString();
			System.out.println(aChar);
		}
		static void convertToBinary(int ascii){
			int[] binary;
			binary = new int[8];
			binary[0] = 0;
			binary[1] = 0;
			binary[2] = 0;
			binary[3] = 0;
			binary[4] = 0;
			binary[5] = 0;
			binary[6] = 0;
			binary[7] = 0;
			while (true){
				if (ascii >= 128){
					binary[0] = 1;
					ascii = ascii - 128;
				}
				else if (ascii >= 64){
					binary[1] = 1;
					ascii = ascii - 64;
				}
				else if (ascii >= 32){
					binary[2] = 1;
					ascii = ascii - 32;
				}
				else if (ascii >= 16){
					binary[3] = 1;
					ascii = ascii - 16;
				}
				else if (ascii >= 8){
					binary[4] = 1;
					ascii = ascii - 8;
				}
				else if (ascii >= 4){
					binary[5] = 1;
					ascii = ascii - 4;
				}
				else if (ascii >= 2){
					binary[6] = 1;
					ascii = ascii - 2;
				}
				else if (ascii >= 1){
					binary[7] = 1;
					ascii = ascii - 1;
				}
				else if (ascii == 0){
					for(int i =0; i < binary.length ; i++)
						System.out.print(binary[i]);
					System.out.println("");
					//System.out.println(binary[7]+binary[6]+binary[5]+binary[4]+binary[3]+binary[2]+binary[1]+binary[0]);
					break;
				}
				//System.out.println(ascii);
				//System.out.println(binary[7]+binary[6]+binary[5]+binary[4]+binary[3]+binary[2]+binary[1]+binary[0]);
			}
			//
		}

		void convertToAscii(int binary){

		}

		public static void main(String[]args) throws IOException{

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("letter to ascii, letter to ");
			while (true){
				System.out.println("What would you like to convert?");
				String con = reader.readLine();
				if (con.equals("ascii to binary")){
					System.out.println("What ascii code do you want to convert?");
					String code = reader.readLine();
					int bin = Integer.parseInt(code);
					convertToBinary(bin);
				}
				else if (con.equals("ascii to letter")){
					System.out.println("What ascii code do you want to convert?");
					String code = reader.readLine();
					int bin = Integer.parseInt(code);
					convertFromAscii(bin);
				}
				else if (con.equals("letter to ascii")){
					System.out.println("What Letter do you want to convert to ascii?");
					String code = reader.readLine();
					convertToAscii(code);
				}
				else if (con.equals("letter to binary") || con.equals("ltb")){
					System.out.println("What Letter do you want to convert to binary?");
					String code = reader.readLine();
					letterToBinary(code);
				}
				else if (con.equals("word to binary")){
					System.out.println("What word do you want to convert to binary?");
					String code = reader.readLine();
					wordToBinary(code);
				}
				else if (con.equals("quit")){
					break;
				}
			}
		}
	}
