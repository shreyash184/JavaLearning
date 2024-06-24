public class ElevatorController {

    private ElevatorCurrState state;
    private ElevatorControlStrategy controlStrategy;


    public ElevatorController(){
        state = new ElevatorCurrState();
    }

    public void moveElevatorToFloor(int floorNum){
        controlStrategy = new FCFSStrategy();

        int nextStop = controlStrategy.determineNextStop(floorNum);

        if(nextStop > state.getCurrFloor()){
            state.setCurrDirection(ElevatorDirection.UP);
        }else if(nextStop < state.getCurrFloor()){
            state.setCurrDirection(ElevatorDirection.DOWN);
        }else{
            state.setCurrDirection(ElevatorDirection.IDLE);
        }
    }


}
