public class Logger {
    private static Logger instance;
    private Logger(){}

    public static Logger getInstance(){
        return SingletonHolder.INSTANCE;
        //Bill Pugh
    }

    public void logToConsole(){ //nie jest statyczny
        // logika
        System.out.println("Wait a moment we have to confirm your order");

    }
    private static class SingletonHolder{
        private static final Logger INSTANCE=new Logger();
    }
}
// rozwiązanie SingletonHolder.INSTANCE opracowane przez Bill Pugh