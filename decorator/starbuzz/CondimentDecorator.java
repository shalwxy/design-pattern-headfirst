package starbuzz;

public abstract class CondimentDecorator extends Baverage {
    protected Baverage baverage;

    public abstract String getDescription();

    // (스타버즈의 사이즈 개념 도입)
    // 그런데 어차피 Baverage에 size 변수가 들어있고, getter가 있으므로 그걸 그냥 이용해도 될텐데?
    public Size getSize() {
        return baverage.getSize();
    }

    // (스타버즈의 사이즈 개념 도입)
    // 의도는 사이즈 별로 첨가물의 가격을 다르게 하고 싶었겠지만
    // CondimentDecorator를 상속받는 각 첨가물에서 cost()를 오버라이딩하고
    // 오버라이딩한 함수에서는 구성된 baverage.cost()에 첨가물의 가격을 더하는 동작을 하기 때문에
    // 아래 코드는 호출될 일이 없어보이고
    // 의도한 동작은 없을 것으로 추정
    // > 위의 예상이 맞았고, 리팩토링해보자
    public double cost() {
        double cost = baverage.cost();
        if (baverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (baverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (baverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
