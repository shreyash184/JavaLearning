//public class Consumer implements Runnable{
//
//    SharedResource sharedResource;
//
//    Consumer(SharedResource sharedResource){
//        this.sharedResource = sharedResource;
//    }
//
//    @Override
//    public void run() {
//        try{
//            if(!sharedResource.queue.isEmpty()){
//                System.out.println("There is nothing to consume please wait");
//                System.out.println("Consumer is waiting to consume and Thread is " + Thread.currentThread().getName());
//                wait();
//            }
//        }catch (Exception e){
//            // Some exception implementation here
//        }
//        sharedResource.consumeItem();
//    }
//}
