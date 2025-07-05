package pizza_store.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();
    public void prepare() {
        System.out.println("================");
        System.out.printf("준비 중: %s\n", name);
        System.out.println("도우를 돌리는 중...");
        System.out.println("소스를 뿌리는 중...");
        System.out.println("토핑을 올리는 중...");
        for (String topping : toppings) {
            System.out.printf(" %s\n", topping);
        }
    }
    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }
    public void box() {
        System.out.println("상자에 피자 담기");
    }
    public String getName() {
        return  name;
    }
}
