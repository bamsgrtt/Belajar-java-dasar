package Percabangan;

public class ELSE_IFstatement {
    public static void main(String[] args) {
        var satu = 75;
        var dua = 80;

        if (satu >= 75 && dua >= 75){
            System.out.println("Anda Lulus");
        } else if (satu >= 70 && dua >= 70) {
            System.out.println("Anda hampir lulus");
        }else {
            System.out.println("Anda tidak lulus");
        }
    }
}
