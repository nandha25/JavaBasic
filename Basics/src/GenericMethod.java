/**
 * Created by nandh on 25-09-2016.
 */
public class GenericMethod {

    public <T> boolean isEqual(GenericClass<T> g1,GenericClass<T> g2){

       return  g1.getT().equals(g2.getT());
    }

}
