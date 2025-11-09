package remote_control_with_undo_detail.receiver;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private final String position;
    private int speed;
    public CeilingFan(String position) {
        this.position = position;
    }
    public void off() {
        this.speed = OFF;
        System.out.println(this.position + " 선풍기가 꺼졌습니다");
    }
    public void high() {
        this.speed = HIGH;
        System.out.println(this.position + " 선풍기 속도가 HIGH로 설정되었습니다");
    }
    public void medium() {
        this.speed = MEDIUM;
        System.out.println(this.position + " 선풍기 속도가 MEDIUM으로 설정되었습니다");
    }
    public void low() {
        this.speed = LOW;
        System.out.println(this.position + " 선풍기 속도가 LOW로 설정되었습니다");
    }
    public int getSpeed() {
        return this.speed;
    }
}
