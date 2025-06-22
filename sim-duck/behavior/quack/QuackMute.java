package behavior.quack;

public class QuackMute implements QuackBehavior {
    public void quack() {
        System.out.println("<< 조용 >>");
    }
}