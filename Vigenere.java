public class Vigenere {
	public static void main(String args[]) {
	

		String input = args[0];  //user's input word
		String key = args[1];   //input key


		char [] code = input.toCharArray();      ///storing input in array
		char [] charcode = key.toCharArray();    ///storing the key in array

		

		int j=0;
		int shiftNumber; 

		for(int i = 0; i<code.length; i++){
			char temp = code[i];
			char vars = charcode[i % key.length()];  ///find the shift amount according to the key letter
			shiftNumber = vars - 96;                 
			temp = (char)((int)temp + shiftNumber);
			char sto = code[i];
			code[i] = temp;

			if(code[i] > 122){///keeps lower case numbers lowercase
				code[i] -= 26;
			}


			if(sto > 64 && sto < 91 && code[i] > 90){///if upercase keep uppercase
				code[i] -= 26;
			}

			if(code[i] == 32 + shiftNumber){   ///if there is a space, do nothing
				code[i] = 32;

			}


		}

		System.out.println(new String(code)); ///print out encoded phrase


		}
	}


		