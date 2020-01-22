/** Minimal creature that blindly moves and attacks.*/
public class Prototype extends Creature {
    @Override
	public void run() {
        while (true) {
            if (! moveForward()) {
                attack();
                turnLeft();
            }
        }
    }

    @Override
	public String getAuthorName() {
        return "Darwin SDK";
    }

    @Override
	public String getDescription() {
        return "Prototyp Creature";
    }
}
