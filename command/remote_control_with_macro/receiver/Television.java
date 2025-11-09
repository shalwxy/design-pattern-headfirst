package remote_control_with_macro.receiver;

public class Television {
    private final String position;
    private int volume;

    public Television(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(this.position + " TV가 켜졌습니다");
    }
    public void off() {
        System.out.println(this.position + " TV가 꺼졌습니다");
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.position + " TV의 볼륨이 " + this.volume + "로 설정되었습니다");
    }
}
