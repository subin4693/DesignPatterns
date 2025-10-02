package CreationalDesignPattern.SingletonPattern;


public class Singleton {
    public static Singleton singleton;
    private Singleton(){}


    // for a single thread it works fine but java has multithread
    // static Singleton getInstance(){
    //    if(singleton != null){
    //        return singleton;
    //   }
    //      singleton = new Singleton()
    //      return new Singleton();
    // }

    // her i have used synchronized keyword so this will not allow mutiple thred access this function at the same time
    // but the problem is threads has to wait to access one by one
    // public static  synchronized Singleton getInstance(){
    //     if(singleton == null){
    //         singleton = new Singleton()
    //         return new Singleton();
    //     }
    //    return singleton;
    // }


    public static Singleton getInstance(){
         if(singleton == null){
             synchronized (Singleton.class){
                 if(singleton == null){
                     singleton = new Singleton();
                 }
             }
         }
         return singleton;
    }

}
