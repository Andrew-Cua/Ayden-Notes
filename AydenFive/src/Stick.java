public class Stick extends Attachment{
    private int deg;

    @Override
    public void run() {

    }

    @Override
    public boolean isDone() {
        return false;


        }
    public boolean isDown(){
        return deg < 0;
    }
    public int getDeg(){
        return deg;
    }
}
