package Method;

public class VariableArgument {
    public static void main(String[] args) {
        int[] values = {80,70,90,100};
        sayCongrats("Bambang", values);

        sayCongrats("Bambang", 90,90,90,90);

    }
    static void sayCongrats(String name, int ... values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus" );
        }else{
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }
}
