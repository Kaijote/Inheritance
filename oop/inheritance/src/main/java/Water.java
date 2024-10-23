public class Water  extends Environment <Swimmable>{

    public void checkTraffic(){
        for( Swimmable item : traffic){
            System.out.println(item.getClass().getSimpleName() + " is swimming!");
        }
    };
}
