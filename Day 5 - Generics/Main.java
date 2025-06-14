import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Iphone i = new Iphone();
        Samsung s = new Samsung();
        MyPhones<Iphone> p = new MyPhones<Iphone>(i);
        MyPhones<Samsung> p2 = new MyPhones<>(s);
        Ferrari f = new Ferrari();
        p.callObj(i);
        p2.callObj(s);
        genericMethod(i);
        genericMethod(s);
    }

    public static <P extends Phone> void genericMethod(P obj){
        System.out.println(obj.getClass());
    }

    public static void boundTopic(){
        // Unbound
        List<?> a = new ArrayList<Number>(); //Number only

        // Upper-bound
        List<? extends Number> u = new ArrayList<Integer>();

        // Lower-bound
        List<? super Number> l = new ArrayList<Object>();

    }
}
