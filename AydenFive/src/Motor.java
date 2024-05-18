public class Motor {
    private float rotations;
    private boolean dir;

    private float speed;
    public float getSpeed(){
        return speed;
    }

    /***
     * Gets the direction of the motor.
     *
     * @return true for cw, false for ccw
     **/
    public boolean isClockwise(){
        return dir;
    }
}
