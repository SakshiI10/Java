interface mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){                   //can't use this
        System.out.println("Good Morning");
    }
    default void record4kvdo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface mywifi{
    String[] getnetworks();
    void connecttonetwork(String network);
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("Calling..."+ phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting...");
    }
}
class mysp extends mycellphone implements mycamera, mywifi{
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordvideo(){
        System.out.println("Taking video");
    }
    // public void record4kvdo(){
    //     System.out.println("Recording 4k vdo");
    // }
    public String[] getnetworks(){
        System.out.println("Getting list of Networks: ");
        String[] networklist = {"Abc", "Def", "Ghi"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to: "+network);
    }
}
public class InterfacesDefaultMethods {
    public static void main(String[] args){
        mysp obj=new mysp();
        obj.takesnap();
        obj.recordvideo();
        obj.record4kvdo();
        String[] arr=obj.getnetworks();
        for (String element : arr) {
            System.out.println(element);
        }
    }
}
