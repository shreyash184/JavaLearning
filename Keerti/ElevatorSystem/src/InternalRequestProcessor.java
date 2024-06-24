public class InternalRequestProcessor {

    public void processRequest(InternalRequest internalRequest){
        ElevatorManager elevatorManager = ElevatorManager.getElevatorManager();
        Elevator elevator = elevatorManager.getElevator(internalRequest.srcElevatorId);
        elevator.moveToFloor(internalRequest.destFloor);
    }
}
