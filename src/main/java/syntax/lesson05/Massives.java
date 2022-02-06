package syntax.lesson05;
import java.util.Arrays;

public class Massives {
    public static void main (String[] args) {
        bubble(true);
        bubble2();
        Lorem();
    }
        static void bubble (boolean f) {
        float[] poryadok = {5f, 6f, 2f, 1f, 9f, 15f, 3f, 4f, 7f, 8f, 11f, 20f, 17f, 19f, 16f};
        int dataLength = poryadok.length;
        float swap;
        boolean sorted;
        for (int i = 0; i < dataLength; i++) {

            sorted = true;

            for (int a = 1; a < (dataLength - i); a++) {
                boolean condom;
                if (f) {
                    condom = poryadok[a - 1] > poryadok[a];
                }
                else {
                    condom = poryadok[a - 1] < poryadok[a];
                }

                if (condom) {
                    swap = poryadok[a - 1];
                    poryadok[a - 1] = poryadok[a];
                    poryadok[a] = swap;
                    System.out.println("Шаг внешнего цикла = " + i + ". Шаг внутреннего цикла = " + a + ". Меняю местами " + poryadok[a - 1] + " и " + poryadok[a]);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        System.out.println(Arrays.toString(poryadok));

    }
        static void bubble2() {
            bubble(false);


        }

        static void Lorem()
        {
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        char[] m = lorem.toCharArray();
        int chars = 0;
        for (char a : m) {
            if (a =='m') {
                chars++;
        }
        }
        System.out.println("Количество 'm' в строке = " + chars);
    }

}



