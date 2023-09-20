public class Duck implements Comparable{
    String name;
    Integer no;

    public Duck(String name, Integer no){
        this.name = name;
        this.no = no;
    }

    public String toString(){
        return name + "weighs " + no;
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck)o;

        if(this.no < duck.no){
            return -1;
        }else if(this.no == duck.no){
            return 0;
        }else {
            return 1;
        }
    }
}
