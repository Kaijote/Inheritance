//public class Road extends Environment <Vehicle> implements Driveable{
public class Road extends Environment  <Driveable> {

    public void checkTraffic(){
        for( Driveable item : traffic){
            System.out.println(item.getClass().getSimpleName() + " is moving!");
        }
    };
}
