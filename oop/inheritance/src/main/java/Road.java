public class Road extends Environment <Vehicle> {

    public void checkTraffic(){
        for( Vehicle item : traffic){
            System.out.println(item.getClass().getSimpleName() + " is moving!");
        }
    };
}
