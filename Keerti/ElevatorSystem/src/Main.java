//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = ElevatorSystem.getElevatorSystem();

        elevatorSystem.initailizeElevatorSystem(12, 2);

        elevatorSystem.sendExternalRequest(ElevatorDirection.DOWN, 10);
        elevatorSystem.sendInternallRequest(7, 4);
    }
}