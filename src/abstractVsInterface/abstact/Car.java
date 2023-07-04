package abstractVsInterface.abstact;

public abstract class Car {
    private String name;
    private int year;
    private int maxSpeed;

    public Car() {
    }
    public Car(String name, int year, int maxSpeed) {
        this.name = name;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public abstract void drive();
    public abstract void stop();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
