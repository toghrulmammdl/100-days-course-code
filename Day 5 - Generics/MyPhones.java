public class MyPhones<T> {

    T obj;

    public MyPhones(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static final String type = "Phone";

    public void callObj(T obj){
        System.out.println(obj.getClass()+" is class of this object");
    }
}
