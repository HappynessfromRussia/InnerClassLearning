package InnerNested;

public class Main {
    public static void main (String[] agrs){
        Parcel parcel = new Parcel();
        Parcel.Destination destination = parcel.new Destination();
        destination.doSomething();
    }
}
