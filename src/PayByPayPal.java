import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PayByPayPal implements PayStrategy{

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("123456789", "amane@wp.pl");
        DATA_BASE.put("reya2022", "reya@ya.com");
        DATA_BASE.put("adamokrasa", "adam21@it.com");
        DATA_BASE.put("konrad", "konrad@onet.pl");
        DATA_BASE.put("artur1997", "artur1997@op.pl");
    }


     //Zebranie danych klienta

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Enter the user's email: ");
                email = READER.readLine();
                System.out.print("Enter the password: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password! Please, check your data one more time!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }


     // Zapisanie danych klienta na rzecz przyszłych zakupów.

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("You chose to pay " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
