public class Position {
    Integer xaxis;
    Integer yaxis;

    public Position(Integer xaxis, Integer yaxis){
        this.xaxis = xaxis;
        this.yaxis = yaxis;
    }

    public Integer getXaxis(){
        return this.xaxis;
    }

    public void setXaxis(Integer xaxis){
        this.xaxis = xaxis;
    }

    public Integer getYaxis(){
        return this.yaxis;
    }

    public void setYaxis(Integer yaxis){
        this.yaxis = yaxis;
    }
}
