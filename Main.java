import java.util.Scanner;

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
  public static void main(String[] args) {
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
