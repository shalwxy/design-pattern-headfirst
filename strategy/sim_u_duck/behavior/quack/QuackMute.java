package sim_u_duck.behavior.quack;

public class QuackMute implements QuackBehavior {
    public void quack() {
        System.out.println("<< 조용 >>");
    }
}