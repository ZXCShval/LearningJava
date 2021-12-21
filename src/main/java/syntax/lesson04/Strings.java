package syntax.lesson04;

public class Strings {

    public static void main(String[] args) {
       String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n" +
               "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n" +
               "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n" +
               "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String s = lorem.replaceAll("o", "ˤ̙̘̗̖̔̒̓̑̐̏̎̍̚̕");
       final String m = s.replaceAll(",","ˤ̙̘̗̖̔̒̓̑̐̏̎̍̚̕");
       //Брат, вот как ты мог бы заменить все вхождения 2-х символов одновременно:
       //s = lorem.replaceAll("[o,]", "ˤ̙̘̗̖̔̒̓̑̐̏̎̍̚̕");
       System.out.println(m);
   }
}
