/**
 * Created by chenximing on 2019/3/30/030.
 * 单例设计模式，恶汉式
 */
public class Singleton {
    //首先要私有构造
    private static Singleton singleton = new Singleton();
    private  Singleton(){

    }
    //对外提供访问方法
    public static Singleton getSingleton (){
        return  singleton;
    }

}
