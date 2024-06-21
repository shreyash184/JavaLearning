public class MacFactory implements IFactory{

    public Ibutton createButton(){
        return new MacButton();
    }

    public Itextbox createTextbox(){
        return new MacTextBox();
    }
}
