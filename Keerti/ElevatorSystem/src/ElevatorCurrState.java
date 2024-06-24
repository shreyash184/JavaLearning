public class ElevatorCurrState {
    private int currentFloor;
    private ElevatorDirection currDirection;
    private ElevatorStatus currStatus;


    public ElevatorCurrState(){
        this.currentFloor = 0;
        this.currDirection = ElevatorDirection.IDLE;
        this.currStatus = ElevatorStatus.IDLE;
    }

    public int getCurrFloor() {
        return currentFloor;
    }

    public void setCurrFloor(int floorNum) {
        currentFloor = floorNum;
    }

    public ElevatorDirection getCurrDirection() {
        return currDirection;
    }

    public void setCurrDirection(ElevatorDirection direction) {
        currDirection = direction;
    }

    public ElevatorStatus getCurrStatus() {
        return currStatus;
    }

    public void setCurrStatus(ElevatorStatus status) {
        currStatus = status;
    }
}
