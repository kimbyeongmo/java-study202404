package day10.quiz;

public class ImageDisplay extends MediaPlayer implements MediaPlayable{


    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지가 정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지가 멈춥니다.");
    }
}
