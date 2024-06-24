

class ExchangeConnector{

    private static volatile ExchangeConnector exchangeConnector;

    private ExchangeConnector(){
        System.out.println("This object only will be created once");
    }

    public static ExchangeConnector getExchangeConnector(){
        if(exchangeConnector == null){
            synchronized (SingletonDP.class) {
                if(exchangeConnector == null){
                    exchangeConnector = new ExchangeConnector();
                }
            }
        }

        return exchangeConnector;
    }
}

public class SingletonDP {
}
