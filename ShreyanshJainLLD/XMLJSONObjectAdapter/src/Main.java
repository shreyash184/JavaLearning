//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface AnalyticTool{
    public void analyze();
}

class XMLToJson implements AnalyticTool{

    public Tool tool;

    public XMLToJson(String data){
        String newData = "json";

        tool = new Tool();
        tool.setData(newData);
    }

    @Override
    public void analyze() {
        tool.analyseData();
    }
}

class Tool{
    String data;

    public void setData(String data){
        this.data = data;
    }

    public void analyseData(){
        if(this.data == "json"){
            System.out.println("The data is analyzed");
        }else{
            System.out.println("Data can't be analyzed");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        AnalyticTool tool1 = new XMLToJson("xml");
        tool1.analyze();


        Tool tool = new Tool();
        tool.setData("json");
        tool.analyseData();
    }
}