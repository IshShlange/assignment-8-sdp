package transport;
import person.viewerInterface;
public class train implements transportInterface {

    public int speed = 120;

    public void in(viewerInterface visit) {
        visit.in(this);
    }

}
