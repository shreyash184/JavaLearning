public class OddEvenStrategy implements ElevatorSelectionStrategy{

    @Override
    public int selectElevator(ExternalRequest externalRequest) {
        if(externalRequest.srcFloor % 2 == 0){
            return 2;
        }else{
            return 1;
        }
    }
}
