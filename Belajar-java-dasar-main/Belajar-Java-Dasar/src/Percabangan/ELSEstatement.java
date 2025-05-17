package Percabangan;

public class ELSEstatement {
    public static void main(String[] args) {
        var bams1 = 90;
        var bams2 = 100;

        if (bams1 <= 75 || bams2 >= 75) {
            System.out.println("Anda Lulus");
        }else {
            System.out.println("Anda Tidak Lulus");
        }
    }
}
