package homework1core;

public class Wall extends Obstacles {
    private int heigth;
    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }
    public int getHeigth() {
        return heigth;
    }
    @Override
    protected boolean moving(Activity activity) {
        System.out.println("стена " + super.getName() + "heigth: " + this.heigth);
        activity.jump();

        if (getHeigth() <= activity.getJumpHeight()) {
            System.out.println("успешно прыгнул");
            return true;
        } else {
            System.out.println("не прыгнул");
            return false;
        }
    }
}