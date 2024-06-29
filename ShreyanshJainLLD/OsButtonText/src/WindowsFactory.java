public class WindowsFactory implements IFactory{

    public Ibutton createButton(){
        return new WindowsButton();
    }

    public Itextbox createTextbox(){
        return new WindowsTextBox();
    }
}
