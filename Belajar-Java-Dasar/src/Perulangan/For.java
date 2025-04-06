package Perulangan;

public class For {
    public static void main(String[] args) {
        // for (initialization; termination; incremnet) {
      //  statement(s)
  //  }
        var conter = 1;
        for (;conter <= 10;){
            System.out.println("InfinityLoop" + conter);

        conter++;
        }

        for (var counter = 1; counter <= 10;counter++){ // dengan post statement
            System.out.println("Perulangan Ke- " + counter);
        }
    }
}
