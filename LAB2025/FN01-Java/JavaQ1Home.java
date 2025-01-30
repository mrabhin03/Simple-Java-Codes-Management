

class Home{
    public int length,width,cost,doors,windows;
    void getdata(int length,int width,int cost,int doors,int windows){
        this.length=length;
        this.width=width;
        this.cost=cost;
        this.doors=doors;
        this.windows=windows;
    }

    double HomeTotalCost(){
        return(length*width)*cost;
    }
}

class Door extends Home{
    public int cost;
    Door(int cost){
        this.cost=cost;
    }
    double DoorCost(){
        return cost*super.doors;
    }

    double TotalCost(Windows obj){
        double homecost=HomeTotalCost();
        double wincost=obj.WindowCost();
        double doorcost=DoorCost();
        System.out.println("HOME: "+homecost);
        System.out.println("Windows: "+wincost);
        System.out.println("Door: "+doorcost);
        return (homecost+wincost+doorcost);
    }
}
class Windows extends Home{
    public int cost;
    Windows(int cost){
        this.cost=cost;
    }
    int WindowCost(){
        return cost*super.windows;
    }
    double TotalCost(Door obj){
        double homecost=HomeTotalCost();
        double wincost=WindowCost();
        double doorcost=obj.DoorCost();
        return (homecost+wincost+doorcost);
    }
}

public class JavaQ1Home{
    public static void main(String ar[]){
        
        Door doorsobj=new Door(2000);
        Windows Windowsobj=new Windows(3000);
        doorsobj.getdata(30,23,500,8,10);
        Windowsobj.getdata(30,23,500,8,10);

        System.out.println("Total Cost is : "+doorsobj.TotalCost(Windowsobj));
    }
}