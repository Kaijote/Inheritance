public class Sky  extends Environment <Flyable>{

    public void checkTraffic(){
        for( Flyable item : traffic){
            System.out.println(item.getClass().getSimpleName() + " is flying!");
        }
    }


}
