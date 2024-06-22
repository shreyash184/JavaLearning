//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface RideState{
    public void handleRequest(Ride uberRide);
    public void handleCancel(Ride uberRide);
    public void handleAssign(Ride uberRide);
}

class RideIdleState implements RideState{

    public void handleRequest(Ride uberRide){
        System.out.println("Requested the ride");
        uberRide.setState(new RideRequestedState());
    }

    public void handleCancel(Ride uberRide){
        System.out.println("Currently you are idle state there is nothing to cancel");
    }

    public void handleAssign(Ride uberRide){
        System.out.println("you are in idle state first request the ride");
    }
}

class RideRequestedState implements RideState{
    public void handleRequest(Ride uberRide){
        System.out.println("Your request has been Accepted");
        handleAssign(uberRide);
    }

    public void handleCancel(Ride uberRide){
        System.out.println("Your request has been cancelled");
        uberRide.setState(new RideIdleState());
    }

    public void handleAssign(Ride uberRide){
        System.out.println("Asssigning Driver to you");
        uberRide.setState(new RideAssignedDriverState());
    }
}

class RideAssignedDriverState implements RideState{
    public void handleRequest(Ride uberRide){
        System.out.println("You have already request a ride");
    }

    public void handleCancel(Ride uberRide){
        System.out.println("Ride has been cancelled driver has been notified");
        uberRide.setState(new RideIdleState());
    }

    public void handleAssign(Ride uberRide){
        System.out.println("Driver is assigned to you");
        uberRide.setState(new RideEnrouteState());
    }
}

class RideEnrouteState implements RideState{
    public void handleRequest(Ride uberRide){
        System.out.println("You are already driving");
    }

    public void handleCancel(Ride uberRide){
        System.out.println("You are in driver cannot cancel");
    }

    public void handleAssign(Ride uberRide){
        System.out.println("You are already driving with a driver assigned");
    }
}

class Ride{
    private RideState state;

    public Ride(){
        state = new RideIdleState();
    }

    public void setState(RideState state){
        this.state = state;
    }

    public void requestRide(Ride uberRide){
        state.handleRequest(uberRide);
        acceptRide(uberRide);
    }

    public void acceptRide(Ride uberRide){
        state.handleRequest(uberRide);
    }

    public void assignDriver(Ride uberRide){
        state.handleAssign(uberRide);
//        state.handleRequest(uberRide);
    }

    public void cancelRide(Ride uberRide){
        state.handleCancel(uberRide);
    }
}

public class Main {
    public static void main(String[] args) {
        Ride uberRide = new Ride();
        uberRide.requestRide(uberRide);
//        uberRide.cancelRide(uberRide);
        uberRide.assignDriver(uberRide);
        uberRide.cancelRide(uberRide);

    }
}