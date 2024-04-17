package day07.player;

// 하위 클래스 (sub class)
// 상위 클래스로부터 공통 필드와 매세드를 내려받은 클래스
public class Warrior extends Player{

    int rage; // 분노게이지

    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }

    public void dash(Warrior target) {
        System.out.printf("DASH 스킬을 사용합니다.");
    }

    // 오버라이딩 : 부모가 물려준 메서드를 고쳐 쓰는 것
    // 규칙 : 부모가 물려준 형태를 유지할 것(파라미터, 리턴타입, 이름 = 시그니처)
    // 규칙 : 접근제한자는 부모보다 more public할 것!
    // 규칙 : 부모가 public이면 자식은 무조건 public으로 해야 되지만, 부모가 default면 그것보다 public 등 더 큰 개념 가능

    @Override // 오버라이딩 룰을 지켰는지 검증해 줌. 오버라이딩 안전장치라고 생각하면 됨
    public void showStatus(){
        super.showStatus();
        System.out.println("# rage: " + this.rage);
    }
}
