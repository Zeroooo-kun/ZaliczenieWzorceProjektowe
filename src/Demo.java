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
        priceOnProducts.put(1, 3);
        priceOnProducts.put(2, 2);
        priceOnProducts.put(3, 4);
        priceOnProducts.put(4, 15);
        priceOnProducts.put(5, 10);
        priceOnProducts.put(6, 16);
        priceOnProducts.put(7, 20);
        priceOnProducts.put(8, 25);

    }

    public static void main(String[] args) throws IOException {
        Service1 service1= new Proxy();
        service1.method();
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Please, select a product which you want to buy:" + "\n" +
                        "1 - Banana" + "\n" +
                        "2 - Apple" + "\n" +
                        "3 - Orange" + "\n" +
                        "4 - Mango" + "\n"+
                        "5 - Watermelon" + "\n"+
                        "6 - Melon" + "\n"+
                        "7 - Passion fruit" + "\n"+
                        "8 - Jackfruit" + "\n");
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
                // Klient tworzy różne strategie na podstawie danych wejściowych użytkownika
                // Konfiguracja aplikacji
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            //Delegaci obiektu zamówienia gromadzą dane płatnicze do obiektu strategii,
            //ponieważ tylko strategie wiedzą, jakich danych potrzebują do przetworzenia płatności.
            order.processOrder(strategy);

            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping?- P/C (Enter 'P' to Pay or 'C' to Continue): ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // Strategia obsługuje płatność
                if (strategy.pay(order.getTotalCost())) {
                    Logger.getInstance().logToConsole(); // logger singleton
                    System.out.println("Payment has been started. Please few seconds for confirmation.");
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
