/**
 * Created by nandh on 25-09-2016.
 */
public class Generic {

    public  static void main (String args[]){


        GenericClass<String> genericClass  = new GenericClass<>();

        genericClass.setT("Hello Word");

        System.out.println(genericClass.getT());

        GenericClass<String> g1  = new GenericClass<>();

        g1.setT("Hello Word");

        GenericClass<String> g2  = new GenericClass<>();

        g2.setT("Hello Word");

        GenericMethod genericMethod = new GenericMethod();

        boolean compare = genericMethod.isEqual(g1,g2);

        System.out.println(compare);



    }
}
