//This class will prompt the user for their number to encrypt or decrypt and then call on the other classes to preform its functions
public class Application {

	public static void main(String[] args) {
		
		//First it will ask for a number to encrypt and display the new number.
		System.out.print("Please enter the 4 didgit number to encrypt: ");
		int encryptedNumber = Encrypter.encrypter();
		System.out.println( "Encrypted number is " + encryptedNumber);
		
		//Second it will ask for a number to decrypt and display that new number
		System.out.print("Please enter the 4 didgit number to decrypt: ");
		int decryptedNumber = Decrypter.decrypter();
		System.out.println( "Decrypted number is " + decryptedNumber);		
		
	}

}
