package Operatorjava;

public class OperatorPerbandingan {
    public static void main(String[] args) {
        int value1 = 100;
        int value2 = 100;

        System.out.println(value1 < value2 );
        System.out.println(value1 > value2 );
        System.out.println(value1 <= value2 );
        System.out.println(value1 >= value2 );
        System.out.println(value1 != value2 );

        //Operasi Boolean
        var absen = 70 ;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }

}
