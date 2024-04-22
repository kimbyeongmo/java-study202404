package day10.quiz;

public class AudioPlayer extends MediaPlayer implements MediaPlayable{

    @Override
    public void play() {
        System.out.println("오디오가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("오디오가 정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("오디오가 멈춥됩니다.");
    }
}
