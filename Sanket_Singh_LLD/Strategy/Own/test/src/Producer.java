//public class Producer implements Runnable{
//
//    SharedResource sharedResource;
//
//    Producer(SharedResource sharedResource){
//        this.sharedResource = sharedResource;
//    }
//
//    @Override
//    public void run() {
//        try{
//            Thread.sleep(5000);
//        }catch (Exception e){
//            // Some execption implementation here
//        }
//
//        if(sharedResource.queue.size() == sharedResource.capacity){
//            try{
//                System.out.println("The queue is full please wait till some one consumes something");
//                wait();
//            }catch (Exception e){
//                // Some handled exception
//            }
//        }else{
//            System.out.println("One more resource is added by producer");
//            sharedResource.addItem();
//            notifyAll();
//        }
//
//    }
//}
