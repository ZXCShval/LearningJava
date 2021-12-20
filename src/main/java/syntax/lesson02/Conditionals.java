package syntax.lesson02;

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
    }
}
