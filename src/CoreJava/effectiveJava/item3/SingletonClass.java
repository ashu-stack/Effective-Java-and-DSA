package CoreJava.effectiveJava.item3;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass aClass = SingletonClass.getInstance();
        System.out.println(aClass.getClass());
    }
}
