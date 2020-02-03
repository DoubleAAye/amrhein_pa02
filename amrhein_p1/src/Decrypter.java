//This class is responsible for decrypting the numbers entered.
import java.util.Scanner;
public class Decrypter {
	
	     public static int decrypter () {
	    	 Scanner in = new Scanner(System.in);
	          int num1, num2, num3, num4, decryptedNumber, baseDidgits;	          
	          
	        //This will read the number and decrypt it one number at a time
	          baseDidgits= in.nextInt();	          
	          num1= (baseDidgits/1000+3)%10;
	          num2= (baseDidgits%1000/100+3)%10;
	          num3= (baseDidgits%100/10+3)%10;
	          num4=(baseDidgits%10+3)%10;
	          
	          //After the number has been decrypted it will reorganize and make anew decrypted number
	          decryptedNumber= (num1*10)+num2 +(num3*1000)+(num4*100);
	          
	          in.close();
	          
			return decryptedNumber;
	      }
}
