import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Demo {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
        priceOnProducts.put(5, 10);
        priceOnProducts.put(6, 20);
    }

    public static void main(String[] args) throws IOException {
        Service1 service1= new Proxy();
        service1.method();
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Please, select a product which you want to buy:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n"+
                        "5 - CD" + "\n"+
                        "6 - DVD" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Please enter how many you want to buy: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N (if Yes enter Y, if Not enter N): ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please enter a number 1 or 2 to select a payment method for your order:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();

                // Client creates different strategies based on input from user,
                // application configuration, etc.
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            // Order object delegates gathering payment data to strategy object,
            // since only strategies know what data they need to process a
            // payment.
            order.processOrder(strategy);

            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping?- P/C (Enter 'P' to Pay or 'C' to Continue): ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // Finally, strategy handles the payment.
                if (strategy.pay(order.getTotalCost())) {
                    Logger.getInstance().logToConsole(); // logger singleton
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data once again. If there is still a problem, please contact our customer service.");
                }
                order.setClosed();
                getUser();
            }
        }
    }
    public static void getUser (){
        User1 user1= new User1();
        User2 user2= new User2();

        Subject subject=new Subject();
        subject.addObserver(user1);
        subject.addObserver(user2);
        subject.startWork();

    }
}
