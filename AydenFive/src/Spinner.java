public class Spinner extends Attachment {
    private float rotations;
    private boolean isLeft;

    public Spinner() {
        this.rotations = 0;
        this.isLeft = true;
    }

    public Spinner(float rotations, boolean isLeft) {
        this.rotations = rotations;
        this.isLeft = isLeft;
    }

    public float getRotations(){
      return rotations;
    }

    @Override
    public void run() {

    }

    @Override
    public boolean isDone() {
        return false;
    }

}
