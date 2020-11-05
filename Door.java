public class Door {

    private boolean car;
    private boolean hold;
    private boolean open;
    private int     number;

    public Door(int number){
        this.number = number;
        this.car  = false;
        this.hold = false;
        this.open = false;
    }

    public int getNumber(){
        return this.number;
    }

    public boolean hasCar(){
        return this.car;
    }
    public void setCar(){
        this.car = !this.car;
    }

    public boolean getHold(){
        return this.hold;
    }
    public void setHold(){
        this.hold = !this.hold;
    }

    public boolean isOpen(){
        return this.open;
    }
    public void openDoor(){
        this.open = !this.open;
    }

    public void drawDoorOne(){
        System.out.println(" _____________________ ");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||        One        ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                O  ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||___________________||");
    }
    public void drawDoorTwo(){
        System.out.println(" _____________________ ");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||        Two        ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                O  ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||___________________||");
    }
    public void drawDoorThree(){
        System.out.println(" _____________________ ");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||       Three       ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                O  ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||                   ||");
        System.out.println("||___________________||");
    }

    public void drawNoCar(){
        System.out.println(" _____________________ ");
        System.out.println("||'\'                  ||");
        System.out.println("|| '\'                 ||");
        System.out.println("||  |                ||");
        System.out.println("||  |                ||");
        System.out.println("||  |                ||");
        System.out.println("||  |                ||");
        System.out.println("||  |                ||");
        System.out.println("||  |                ||");
        System.out.println("||  |                ||");
        System.out.println("||  |                ||");
        System.out.println("|| O|                ||");
        System.out.println("||  |                ||");
        System.out.println("||  |                ||");
        System.out.println("||__|________________||");
        System.out.println("  '\' |");
        System.out.println("   \|");
    }


    public void drawCar(){
        System.out.println(" _____________________ ");
        System.out.println("||'\'                  ||");
        System.out.println("|| '\                  ||");
        System.out.println("||  |                 ||");
        System.out.println("||  |                 ||");
        System.out.println("||  |    ________     ||");
        System.out.println("||  |   /____|___'\'__ ||");
        System.out.println("||  |  (     |    __) ||");
        System.out.println("||  |    O-------O    ||");
        System.out.println("||  |                 ||");
        System.out.println("||  |                 ||");
        System.out.println("|| O|                 ||");
        System.out.println("||  |                 ||");
        System.out.println("||  |                 ||");
        System.out.println("||__|______ __________||");
        System.out.println("  '\'|");
        System.out.println("   ''|");
    }
    
}
