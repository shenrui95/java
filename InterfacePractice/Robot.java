public class Robot{
    String name;
    String status = "on";
    protected int fuel = 0;
    public void turnon(){
        if(this.status == "on"){
            System.out.println("It's already on");
        } else if(this.fuel == 0){
            System.out.println("Please add the fuel first.");
        } else{
            System.out.println("...... It is on now");
            this.status = "on";
        }
    }
    public void turnoff(){
        this.status = "off";
        System.out.println("Shutding Down......");
    }
    public void addfuel(int adding){
        System.out.println("Adding " + adding + " fuel to " + this.name);
        this.fuel = adding;
    }
    public void fuelcheck(){
        System.out.println(this.fuel);
    }
}