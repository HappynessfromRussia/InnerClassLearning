package InnerNested;

public class Parcel {

    private String recepient;
    private int mass;
    //...

    class Destination{
        private String street;
        private int homeNumber;
        private int roomNumber;

        public void doSomething(){
            System.out.println(mass);
        }
    }



    //...


}
