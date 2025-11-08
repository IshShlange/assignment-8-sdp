package person;
import transport.bus;
import transport.train;

public class calculateTime implements viewerInterface{
    double distance=312;
    public void in(bus Bus){
        double time= distance/Bus.speed;
        System.out.println(" Vi proekhali " + (int)distance + " kilometrov za " + time + " chasov" );
    };
    public void in(train Train){
        double time= distance/Train.speed;
        System.out.println(" Vi proekhali " + (int)distance + " kilometrov za " + time + " chasov" );
    };


}
