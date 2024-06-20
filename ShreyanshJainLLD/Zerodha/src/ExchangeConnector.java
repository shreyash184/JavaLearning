public class ExchangeConnector {

    private static volatile ExchangeConnector exchangeConnector;

    private ExchangeConnector(){
        System.out.println("Getting the Exchange Connector");
    }

    public static ExchangeConnector getInstance(){
        if(exchangeConnector == null){
            synchronized (ExchangeConnector.class){
                if(exchangeConnector == null){
                    exchangeConnector = new ExchangeConnector();
                }
            }
        }
        return exchangeConnector;
    }

    public void sendOrderToExecution(){
        System.out.println("Order sent to the Execution !! Congratulations !!!");
    }
}
