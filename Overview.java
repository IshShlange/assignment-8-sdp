import person.*;
import transport.*;

public class Overview {
    public void OverviewCalcs(){
    bus Bus = new bus();
    train Train = new train();
    calculateTime calculator = new calculateTime();

        Bus.in(calculator);
        Train.in(calculator);

}
}
