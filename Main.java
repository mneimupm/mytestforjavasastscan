import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.lang.reflect.Field;
import java.io.*;

public class Main {
private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public void login() {
        String inputUsername = "admin";
        String inputPassword = "password123";
        if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
	    System.out.format("First string: %s Second string: %s", "Hello world");
    }

    public void vulnerableSQL(String userId) {
        String query = "SELECT * FROM users WHERE id = " + userId;
        // execute the query
    }

    public boolean compareValues(int value1, int value2) {
        return value1 == value2;
    }
	
  public static void main(String[] args) throws IOException {
	  long data;

			BufferedReader readerBuffered = new BufferedReader(
					new InputStreamReader(System.in, "UTF-8"));
			String stringNumber = readerBuffered.readLine();
			if (stringNumber != null) {
				data = Long.parseLong(stringNumber.trim());
			} else {
				data = 0;
			}

			// AVOID: potential truncation if input data is very large,
			// for example 'Long.MAX_VALUE'
			int scaled = (int)data;

			//...

			// GOOD: use a guard to ensure no truncation occurs
			int scaled2;
			if (data > Integer.MIN_VALUE && data < Integer.MAX_VALUE)
				scaled2 = (int)data;
			else
				throw new IllegalArgumentException("Invalid input");
	  // BAD: A new 'Random' object is created every time
	// a pseudo-random integer is required.
	int notReallyRandom = new Random().nextInt();
	int notReallyRandom2 = new Random().nextInt();
	
	// GOOD: The same 'Random' object is used to generate 
	// two pseudo-random integers.
	Random r = new Random();
	int random1 = r.nextInt();
	int random2 = r.nextInt();
	  
	  //----------------------------------------
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su nombre:");
    String name = scanner.nextLine();

    System.out.println("Bienvenido, " + name + "!");
    /*
    // BAD: DES is a weak algorithm 
Cipher des = Cipher.getInstance("DES");
cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

byte[] encrypted = cipher.doFinal(input.getBytes("UTF-8"));

// ...

// GOOD: AES is a strong algorithm
Cipher des = Cipher.getInstance("AES");
    
    KeyPairGenerator keyPairGen1 = KeyPairGenerator.getInstance("RSA");
    keyPairGen1.initialize(1024); // BAD: Key size is less than 2048

    KeyPairGenerator keyPairGen2 = KeyPairGenerator.getInstance("DSA");
    keyPairGen2.initialize(1024); // BAD: Key size is less than 2048

    KeyPairGenerator keyPairGen3 = KeyPairGenerator.getInstance("DH");
    keyPairGen3.initialize(1024); // BAD: Key size is less than 2048

    KeyPairGenerator keyPairGen4 = KeyPairGenerator.getInstance("EC");
    ECGenParameterSpec ecSpec = new ECGenParameterSpec("secp112r1"); // BAD: Key size is less than 256
    keyPairGen4.initialize(ecSpec);

    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(64); // BAD: Key size is less than 128
    */
    
  }
  
 /* 
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		// BAD: a request parameter is written directly to the Servlet response stream
		response.getWriter().print(
				"The page \"" + request.getParameter("page") + "\" was not found.");

	}
  */
  
  
}
