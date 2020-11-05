
// Door class.
// Hides cars and opens if you don't choose it 
// or hide a car behind it.

public class Door {

    private boolean car;    // Is there a car behind this door?
    private boolean hold;   // Is the program allowed to open this door?
    private boolean open;   // is the door open?
    private int     number; // Doors need names

    public Door(int number){
        this.number = number;
        this.car  = false;
        this.hold = false;
        this.open = false;
    }
    // getters and setters
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
    // Door one
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
    //Door two
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
    //Door three
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
    // Open door
    public void drawNoCar(){
        System.out.println(" _____________________ ");
        System.out.println("||\\\\                 ||");
        System.out.println("|| \\\\                ||");
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
        System.out.println(" \\\\ |");
        System.out.println("  \\\\|");
    }

    // open door with a car
    public void drawCar(){
        System.out.println(" _____________________ ");
        System.out.println("||\\\\                  ||");
        System.out.println("|| \\\\                 ||");
        System.out.println("||  |                 ||");
        System.out.println("||  |                 ||");
        System.out.println("||  |    _________    ||");
        System.out.println("||  |   /____|___\\\\__ ||");
        System.out.println("||  |  (  ___|_______)||");
        System.out.println("||  |    O        O   ||");
        System.out.println("||  |                 ||");
        System.out.println("||  |                 ||");
        System.out.println("|| O|                 ||");
        System.out.println("||  |                 ||");
        System.out.println("||  |                 ||");
        System.out.println("||__|_________________||");
        System.out.println(" \\\\ |");
        System.out.println("  \\\\|");
    }
    
}
