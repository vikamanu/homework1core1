package homework1core;

public abstract class Obstacles {
    private String name;

    public Obstacles(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Activity activity);

    public String getName() {
        return name;
    }
}

