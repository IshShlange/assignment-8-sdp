package transport;
import person.viewerInterface;
public class bus implements transportInterface {
    public int speed = 80;

    public void in(viewerInterface visit) {
        visit.in(this);
    }
}
