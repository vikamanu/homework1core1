package homework1core;

public class Treadmill extends Obstacles {
    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    @Override
    protected boolean moving(Activity activity) {
        System.out.println("беговая дорожка " + super.getName() + " length: " + this.length);

        activity.run();

        if (getLength() <= activity.getRunDistance()) {
            System.out.println("успешно пробежал");
            return true;
        } else {
            System.out.println("не пробежал");
            return false;
        }
    }
}
