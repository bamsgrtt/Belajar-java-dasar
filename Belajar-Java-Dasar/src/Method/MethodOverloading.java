package Method;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("bambang");
        sayHello("Bambang", "Sugiarto");

    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name) {
        System.out.println("Hello " + name);

    }
    static void sayHello(String name,String name2){
        System.out.println("Hello " + name + " " + name2);
    }

}
