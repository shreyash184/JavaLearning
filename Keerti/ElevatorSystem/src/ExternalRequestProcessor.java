public class ExternalRequestProcessor {
    private ElevatorSelectionStrategy elevatorSelectionStrategy;
    public ExternalRequestProcessor(){
        elevatorSelectionStrategy = new OddEvenStrategy();
    }
    public void processRequest(ExternalRequest externalRequest){
        int assignedElevatorId = elevatorSelectionStrategy.selectElevator(externalRequest);
        ElevatorManager elevatorManager = ElevatorManager.getElevatorManager();
        Elevator assignedElevator = elevatorManager.getElevator(assignedElevatorId);
        assignedElevator.moveToFloor(externalRequest.srcFloor);

    }
}
