package Method;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(10));

        System.out.println(factRecursive(5));
        loop(1000); //  jika lebih 10000 maka errorStackOverlow
    }
    static int factorialLoop(int value){ //Facktorial biasa
        var result = 1;

         for (var counter = 1; counter <= value; counter++){
             result *= counter;
         }
         return result;
    }
    static int factRecursive(int value) { // Recursive Method
        if (value == 1) {
            return 1;
        } else {
            return value * factRecursive(value - 1);
        }

    }
    static void loop(int value){
        if (value == 0){
            System.out.println("Selesai");
        }else {
            System.out.println("Loop" + value);
            loop(value - 1);
        }
    }
}
