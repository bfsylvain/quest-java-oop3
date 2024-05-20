public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setIsFlying(boolean value) {
        this.flying = value;
    }
    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if(this.altitude == 0 && !this.flying) {
        this.flying = true;
        System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public void ascend(int altitude) {

        this.altitude += altitude;
        System.out.printf("%s flies upward, altitude : %d.%n", this.getName(), this.altitude);
    }

    @Override
    public void descend(int altitude) {
        this.altitude -= altitude;
        System.out.printf("%s flies downward, altitude : %d.%n", this.getName(), this.altitude);
    }

    @Override
    public void glide() {
        if (this.flying) {
            System.out.printf("%s glides into the air.%n", this.getName());
        } else {
            System.out.printf("%s cannot glide, he's a lazy bastard on the ground.%n", this.getName());
        }
    }

    @Override
    public void land() {
        System.out.printf(this.altitude > 1
                ? "%s cannot land, this pothead is high as fuck.%n"
                : "%s lands on the ground.%n", this.getName());
    }
}
