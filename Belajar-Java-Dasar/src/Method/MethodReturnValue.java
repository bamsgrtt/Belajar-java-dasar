package Method;

public class MethodReturnValue {
    public static void main(String[] args) {
       var result1 = sum(100,100);
        System.out.println(result1);

        System.out.println(hitung(100,"+",100));
        System.out.println(hitung(100,"-",100));
        System.out.println(hitung(100,"*",100));
    }

    static int sum(int value, int value2){
        var total =value + value2;
        return total;
    }
    static int hitung(int value , String operasi , int value2){
        switch (operasi){
            case "+" :
            return value + value2;
            case "-" :
                return value - value2;
            case "*" :
                return value*value2;
            default:
                return 0;
        }
    }
}
