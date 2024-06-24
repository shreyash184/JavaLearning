public class Elevator {

    private int elevatorId;
    private ElevatorController controller;

    public Elevator(){
        controller = new ElevatorController();
    }

    public int getElevatorId(){
        return this.elevatorId;
    }

    public void moveToFloor(int floorNum){
        controller.moveElevatorToFloor(floorNum);
    }
}
