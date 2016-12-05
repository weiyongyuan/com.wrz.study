package concurrent_study.com.wrz.study;

public class Ball implements Rollable {
	private String name;

	public String getName() {
		return name;
	}

	public Ball(String name) {
		this.name = name;
	}

	public void play() {
		Ball ball = new Ball("Football");
		System.out.println(ball.getName());
	}
	
	public static void main(String[] args) {
		new Ball("pp").play();
	}
}

interface Playable {
    void play();
}
interface Bounceable {
    void play();
}
interface Rollable extends Playable, Bounceable {
    Ball ball = new Ball("PingPang");

}