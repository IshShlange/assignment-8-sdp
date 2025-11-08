import person.*;
import transport.*;
public class Main {
    public static void main(String[] args) {
        bus Bus = new bus();
        train Train = new train();
        calculateTime calcualtor = new calculateTime();

        Bus.in(calcualtor);
        Train.in(calcualtor);
    }
}