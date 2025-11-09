package remote_control.receiver;

public class CeilingFan {
    private final String position;
    private String speed;
    public CeilingFan(String position) {
        this.position = position;
    }
    public void on() {
        System.out.println(this.position + " 선풍기가 켜졌습니다");
    }
    public void off() {
        System.out.println(this.position + " 선풍기가 꺼졌습니다");
    }
    public void setSpeed(String speed) {
        this.speed = speed;
        System.out.println(this.position + " 속도가 " + this.speed + "로 설정되었습니다");
    }
}
