//This class is responsible for encrypting the numbers entered.
import java.util.Scanner;
public class Encrypter {

	   public static int encrypter () {
		   Scanner in = new Scanner(System.in);
	          int num1, num2, num3, num4, encryptedNumber, baseDigits;
	          
	          //This will read the number and encrypt it one number at a time
	          baseDigits= in.nextInt();
	          num1= (baseDigits/1000+7)%10;
	          num2= (baseDigits%1000/100+7)%10;
	          num3= (baseDigits%100/10+7)%10;
	          num4=(baseDigits%10+7)%10;
	          
	          //After the number has been encrypted it will reorganize and make anew encrypted number
	          encryptedNumber= num1*10+num2 + num3*1000 + num4*100;
	          	          	          
			return encryptedNumber;
	          }
	     }
