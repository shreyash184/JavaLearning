import javax.crypto.Mac;

interface MachineState{
    public void clickOnInsertButton(VendingMachine machine);
    public void insertCoin(VendingMachine machine);
    public void selectProduct(VendingMachine machine);
    public void dispenseProduct(VendingMachine machine);
    public void cancel(VendingMachine machine);
    public void refundAllMoney(VendingMachine machine);
}

class IdleState implements MachineState{

    @Override
    public void clickOnInsertButton(VendingMachine machine) {
        System.out.println("Please insert the coin now");
        machine.setState(new AcceptCoinState());
        System.out.println(machine.getState().getClass().getName());
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void cancel(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void refundAllMoney(VendingMachine machine) {
        System.out.println("Invalid operation");
    }
}

class AcceptCoinState implements MachineState{

    @Override
    public void clickOnInsertButton(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Now you have inserted the coin, now please select the product");
        machine.setState(new selectProductState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void cancel(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void refundAllMoney(VendingMachine machine) {
        System.out.println("Invalid operation");
    }
}

class selectProductState implements MachineState{

    @Override
    public void clickOnInsertButton(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Now you have selected the product");
        machine.setState(new dispenseProductState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void cancel(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void refundAllMoney(VendingMachine machine) {
        System.out.println("Invalid operation");
    }
}

class dispenseProductState implements MachineState{

    @Override
    public void clickOnInsertButton(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Dispensing your product");
        machine.setState(new IdleState());
    }

    @Override
    public void cancel(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void refundAllMoney(VendingMachine machine) {
        System.out.println("Invalid operation");
    }
}

class VendingMachine{
    public MachineState state;

    VendingMachine(){
        this.state = new IdleState();
    }

    public MachineState getState(){
        return this.state;
    }

    public void setState(MachineState state){
        this.state = state;
    }
}


public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        MachineState state = machine.getState();

        System.out.println(state.getClass().getName());
//        state = machine.getState();
        state.clickOnInsertButton(machine);
//        state = machine.getState();

        System.out.println(state.getClass().getName());
        state.insertCoin(machine);

        System.out.println(state.getClass().getName());
        state.selectProduct(machine);

        System.out.println(state.getClass().getName());
        state.dispenseProduct(machine);

        System.out.println(state.getClass().getName());
    }
}