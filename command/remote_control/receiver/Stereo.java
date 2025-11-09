package remote_control.receiver;

public class Stereo {
    private final String position;
    private int volume;

    public Stereo(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(this.position + " 오디오가 켜졌습니다");
    }
    public void off() {
        System.out.println(this.position + " 오디오가 꺼졌습니다");
    }
    public void setCd() {
        System.out.println(this.position + " 오디오에서 CD가 재생됩니다");
    }
    public void setDvd() {
        System.out.println(this.position + " 오디오에서 DVD가 재생됩니다");
    }
    public void setRadio() {
        System.out.println(this.position + " 오디오에서 라디오가 재생됩니다");
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.position + " 오디오의 볼륨이 " + this.volume + "로 설정되었습니다");
    }
}
