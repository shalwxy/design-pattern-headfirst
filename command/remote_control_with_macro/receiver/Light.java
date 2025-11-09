package remote_control_with_macro.receiver;

public class Light {
    private final String position;
    public Light(String position) {
        this.position = position;
    }
    public void on() {
        System.out.println(this.position + " 조명이 켜졌습니다");
    }
    public void off() {
        System.out.println(this.position + " 조명이 꺼졌습니다");
    }
}
