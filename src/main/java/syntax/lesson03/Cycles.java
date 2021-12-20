package syntax.lesson03;

public class Cycles {
    public static void main(String[] args) {
        {
            int Ken = 1000;
            while (Ken > 0) {
                System.out.println(Ken);
                Ken -= 7;
                if (Ken < 400 & Ken > 393){
                    System.out.println("Канеки-кун, тебя ждет сороконожка в ухо, сука");
                }
            }
        }
}
}