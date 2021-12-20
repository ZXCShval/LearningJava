package syntax.lesson02;

import java.time.LocalDate;

public class Conditionals {
    public static void main (String[] args) {
        int MyFavNumber = 69;
        if (MyFavNumber == 42) {
            System.out.println(MyFavNumber*3);
        }
        if (MyFavNumber < 42) {
            System.out.println(MyFavNumber*2);
        }
        if (MyFavNumber > 42){
            System.out.println(MyFavNumber-42);
        }
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        switch(dayOfWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend");
        }

        }
    }

