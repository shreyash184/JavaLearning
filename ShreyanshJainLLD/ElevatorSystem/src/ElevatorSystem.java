public class ElevatorSystem {

    private static ElevatorSystem elevatorSystem;
    private int noOfFloors;
    private int noOfElevators;
    private ExternalRequestProcessor externalRequestProcessor;
    private InternalRequestProcessor internalRequestProcessor;

    private ElevatorSystem(){
        System.out.println("Elevator system is created");
    }


    public static ElevatorSystem getElevatorSystem(){
        if(elevatorSystem == null){
            elevatorSystem = new ElevatorSystem();
        }
        return elevatorSystem;
    }


    public void initailizeElevatorSystem(int noOfFloors, int noOfElevators){
        this.noOfElevators = noOfElevators;
        this.noOfFloors = noOfFloors;


        ElevatorManager elevatorManager = ElevatorManager.getElevatorManager();
        elevatorManager.initializeElevators(noOfFloors);


        externalRequestProcessor = new ExternalRequestProcessor();
        internalRequestProcessor = new InternalRequestProcessor();
    }


    public void sendExternalRequest(ElevatorDirection elevatorDirection, int srcFloor){
        externalRequestProcessor.processRequest(new ExternalRequest(elevatorDirection, srcFloor));
    }

    public void sendInternallRequest(int srcElevatorId, int destFloor){
        internalRequestProcessor.processRequest(new InternalRequest(srcElevatorId, destFloor));
    }

}
