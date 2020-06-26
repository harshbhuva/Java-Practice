import java.util.Scanner;

class Fan{

    final int SLOW, MEDIUM, FAST;
    private int speed;
    private boolean on;
    private double radius;
    String color = new String();

    Fan() {
        this.SLOW = 1;
        this.MEDIUM = 2;
        this.FAST = 3;
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        color = "Blue";
    }

    void startFan(){
        this.on = true;
    }

    String tostring(){
        String details = new String();
        int speed = this.speed;
        String color = this.color;
        double radius = this.radius;

        if(on){
            details = String.valueOf(speed + "  ").concat(String.valueOf(radius)).concat("     " +color);
            System.out.println();
            return details;
        }

        else{
            details = String.valueOf(radius + "  ").concat(String.valueOf("  " + color));
            System.out.println("\nFan is off. Speed: 0");
            return details;
        }
    }

    void changeSpeed(int a){
        System.out.println("Current Speed: " + this.speed);

        if(a==2) {
            this.speed = MEDIUM;
            System.out.println("Changed to MEDIUM");
        }
        if(a==3){
            this.speed = MEDIUM;
            System.out.println("Changed to FAST");
        }
        if(a>3){
            System.out.println("Speed out of range. Maximum Speed: 3");
        }
    }
}

public class Sample1{
    public static void main(String args[]){
        Fan Havells = new Fan();
        String a = new String();
        Havells.startFan();

        Havells.changeSpeed(2);
        a = Havells.tostring();
        System.out.println(a);

        Fan Crompton = new Fan();
        System.out.println(Crompton.tostring());
    }
}
