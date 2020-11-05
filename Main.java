
import java.util.Scanner;

public class Main {
    // Draw 3 different states of the door 
    // closed, open with no car, open with car
    public static void drawDoor(Door door){
        System.out.println("    ");
        if (door.isOpen() && door.hasCar()){
            door.drawCar();
        }
        else if (door.isOpen() && !(door.hasCar())){
            door.drawNoCar();
        }
        else{
            if (door.getNumber() == 1){
                door.drawDoorOne();
            }
            else if (door.getNumber() == 2){
                door.drawDoorTwo();
            }
            else if (door.getNumber() == 3){
                door.drawDoorThree();
            }
        }
        System.out.println("    ");

    }

    // Calls draw function for all three doors.
    public static void drawDoors(Door one, Door two, Door three){
        drawDoor(one);
        drawDoor(two);
        drawDoor(three);
    }
    // The meat of the program
    public static void montyHall(){
        // User input object
        Scanner in = new Scanner(System.in);
        //Setup
        Door   one   = new Door(1);
        Door   two   = new Door(2);
        Door   three = new Door(3);
        
        boolean error = false;
        int d = 0;
        Random num   = new Random(0, 2);
        // Hide the car and hold so the program doesn't open it.
        // I saw this return a -1 once so it's a loop just in case.
        do{
            error = false;
            d = num.getNumber();
            if (d == 0){
                one.setCar();
                one.setHold();
            }

            else if (d == 1){
                two.setCar();
                two.setHold();
            }

            else if (d == 2){
                three.setCar();
                three.setHold();
            }

            else{
                System.out.println("Error: Random object returned: " + d);
                num.newNumber();
                error = true;
            }
        }while(error);
        
        drawDoors(one, two, three);

        //Choose your first door
        int door;
        System.out.println("Behind one these three doors there is a car."); 
        System.out.println("If you can pick the door with the car behind it you win!");
        System.out.println("Which door do you think the car is behind?"); 
        System.out.println("1, 2, or 3");
        door = in.nextInt();
        //Hold means the program can't open that door.
        if ((door == 1) && !(one.getHold())){
            one.setHold();
        }

        else if ((door == 2) && !(two.getHold())){
            two.setHold();
        }

        else if ((door == 3) && !(three.getHold())){
            three.setHold();
        }

        boolean loop = true;
        int misdirect;
        num.newNumber();
        misdirect = num.getNumber();
        while(loop){
            if (misdirect == 0){
                if (!one.getHold()){
                    one.openDoor();
                    System.out.println("Door " + (misdirect + 1) + " has no car behind it!");
                    loop = false;
                }
                else{
                    misdirect = 1;
                }
                
            }
    
            else if (misdirect == 1){
                if (!two.getHold()){
                    two.openDoor();
                    System.out.println("Door " + (misdirect + 1) + " has no car behind it!");
                    loop = false;
                }
                else{
                    misdirect = 2;
                }
                
            }
    
            else if (misdirect == 2){
                if (!three.getHold()){
                    three.openDoor();
                    System.out.println("Door " + (misdirect + 1) + " has no car behind it!");
                    loop = false;
                }
                else{
                    misdirect = 0;
                }
                
            }
        }

        drawDoors(one, two, three);
        //Final choice (p.s. if you change doors your 
        //               chances of getting the car are 2 in 3.)
        System.out.println("Now that there are only two doors remaining,");
        System.out.println("would you like to stay with door " + door);
        System.out.println("or would you like to change doors?");
        System.out.println("1, 2, or 3");
        door = in.nextInt();
        loop = true;
        while(loop){
            if (door == 1){
                if (!one.isOpen()){
                    one.openDoor();
                    if (one.hasCar()){
                        System.out.println("Congratulations you won an ascii art car!");
                        drawDoors(one, two, three);
                    }
                    else{
                        System.out.println("Unfortunately there is no car behind this door");
                        drawDoors(one, two, three);
                    }
                    loop = false;
                }
                else{
                    System.out.println("Door " + door + " has already been opened!");
                }
                
            }
    
            else if (door == 2){
                if (!two.isOpen()){
                    two.openDoor();
                    if (two.hasCar()){
                        System.out.println("Congratulations you won an ascii art car!");
                        drawDoors(one, two, three);
                    }
                    else{
                        System.out.println("Unfortunately there is no car behind this door");
                        drawDoors(one, two, three);
                    }
                    loop = false;
                }
                else{
                    System.out.println("Door " + door + " has already been opened!");
                }
                
            }
    
            else if (door == 3){
                if (!three.isOpen()){
                    three.openDoor();
                    if (three.hasCar()){
                        System.out.println("Congratulations you won an ascii art car!");
                        drawDoors(one, two, three);
                    }
                    else{
                        System.out.println("Unfortunately there is no car behind this door");
                        drawDoors(one, two, three);
                    }
                    loop = false;
                }
                else{
                    System.out.println("Door " + door + " has already been opened!");
                }
                
            }
            else{
                System.out.println("Sorry your answer was not recognized try again.");
                System.out.println("1, 2, or 3");
                door = in.nextInt();
            }
        }
        in.close();        

    }


    // Main puts monty hall in a loop for optional repeated guessing games.
    public static void main(String[] args) {
        //loop sandwich
        boolean guess = true;
        Scanner answer = new Scanner(System.in);
        char A = 'y';
        while(guess){
            //Program meat
            montyHall();

            System.out.println("Would you like to guess again?");
            System.out.println("(Y/N)");
            A = answer.next().charAt(0);
            if (A == 'n'){
                guess = false;
            }

        }
        answer.close();

        
    }
    
}
