import java.security.cert.CertPathValidatorException;
import java.util.HashMap;
import java.util.Map;

public class ElevatorManager {
    private static ElevatorManager elevatorManager;

    private Map<Integer, Elevator> elevators;


    private ElevatorManager(){
        elevators = new HashMap<>();
    }

    public static ElevatorManager getElevatorManager(){
        if(elevatorManager == null){
            elevatorManager = new ElevatorManager();
        }
        return elevatorManager;
    }

    public void initializeElevators(int noOfFloors){
        for(int i=1; i<=noOfFloors; i++){
            elevators.put(i, new Elevator());
        }
    }

    public Elevator getElevator(Integer elevatorId){
        return elevators.get(elevatorId);
    }
}
