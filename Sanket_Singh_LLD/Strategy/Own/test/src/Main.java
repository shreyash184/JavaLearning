//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);

        Thread t1 =  new Thread(() -> {
            try{
                for(int i=0; i<6; i++){
                    sharedResource.produce(i);
                    Thread.sleep(2000);
                }
            } catch (Exception e){
                System.out.println("Something went wrong while producing");
            }
        });

        Thread t2 = new Thread(() -> {
           try{
               for(int i=0;i<6;i++){
                   sharedResource.consume();
                   Thread.sleep(7000);
               }
           }catch (Exception e){
               System.out.println("Something went wront while consuming");
           }
        });

        t1.start();
        t2.start();
    }
}