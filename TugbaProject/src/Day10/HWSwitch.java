package Day10;


import java.util.Scanner;

public class HWSwitch {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Today is");
        String s1 = scan.nextLine();

        switch(s1){
            case "Monday":
                System.out.println(1);
            break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("not in range");
                break;

        }

    }
}
