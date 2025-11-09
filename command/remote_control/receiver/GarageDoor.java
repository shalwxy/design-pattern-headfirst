package remote_control.receiver;

public class GarageDoor {
    public final String position;
    public GarageDoor(String position) {
        this.position = position;
    }
    public void up() {
        System.out.println(this.position + " 차고 문이 열렸습니다");
    }
    public void down() {
        System.out.println(this.position + " 차고 문이 닫혔습니다");
    }
    public void stop() {
        System.out.println(this.position + " 차고 문이 멈췄습니다");
    }
    public void lightOn() {
        System.out.println(this.position + " 차고 조명이 켜졌습니다");
    }
    public void lightOff() {
        System.out.println(this.position + " 차고 조명이 꺼졌습니다");
    }
}
