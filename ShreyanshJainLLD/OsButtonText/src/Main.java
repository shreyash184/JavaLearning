//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GUIAbstractFactory guiAbstractFactory = new GUIAbstractFactory();

        IFactory  ifactory = guiAbstractFactory.createFactory("Windows");

        Ibutton ibutton = ifactory.createButton();
        Itextbox itextbox = ifactory.createTextbox();

        ibutton.press();;
        itextbox.setText();
    }
}