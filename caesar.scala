
object Ceasar extends App{

	//Define Alphabet
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ .0123456789+-*/"

	println("--------------------Instructions--------------------")
	println("First you have to enter the number of letters you want to shift, it can be either positive or negative")
	println("Next enter the meassage you want to encrypt or decrypt, and with the previous value the letters will be shifted and the output will be generated")

	// shift = (# + 42) % 42 with this we can take anyy number (even if it is negative, or bigger than the alphabet size) 
	val shift = (scala.io.StdIn.readLine("Enter the number to shift the letters by: ","\n").toInt + alphabet.size) % alphabet.size

	//the code to encrypt/decrypt
	val inputText = scala.io.StdIn.readLine("Enter the message you want to Encrypt or Decrypt: ","\n")

	//Encrypt/Decrypt the code
	val outputText = inputText.map( (c: Char) => { 

		//find the c char in allowed alphabet
		val x = alphabet.indexOf(c.toUpper)

		//If c char is in alphabet then encrypt it 
		//If it is not then leave it be
		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});

	//the encrypted or decrypted output
	println("The output:" + outputText);
}