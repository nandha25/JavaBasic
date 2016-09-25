/**
 * Created by nandh on 25-09-2016.
 */
public interface GenericInterface {

        public <T> boolean isEqual(GenericClass<T> i1, GenericClass<T> i2);
    //public <T extends  Object> boolean isEqual(GenericClass<T> i1, GenericClass<T> i2);
}
