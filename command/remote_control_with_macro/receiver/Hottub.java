package remote_control_with_macro.receiver;

public class Hottub {
    private final String position;
    private int temperature;
    public Hottub(String position) {
        this.position = position;
    }
    public void on() {
        System.out.println(this.position + " 욕조가 켜졌습니다");
    }
    public void off() {
        System.out.println(this.position + " 욕조가 꺼졌습니다");
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(this.position + " 욕조의 온도가 " + this.temperature + "로 설정되었습니다");
    }
}
