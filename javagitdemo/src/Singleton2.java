/**
 * Created by chenximing on 2019/3/30/030.
 */
public class Singleton2 {
    private static  Singleton2 singleton = null;
    private Singleton2(){}
    public  static Singleton2 getSingleton(){
        synchronized (singleton){
            if(singleton==null){
                singleton =  new Singleton2();
            }
        }
       return  singleton;
    }
}
