public class GUIAbstractFactory {

    public IFactory createFactory(String osType){
        if(osType == "Windows"){
            return new WindowsFactory();
        }else{
            return new MacFactory();
        }
    }
}
