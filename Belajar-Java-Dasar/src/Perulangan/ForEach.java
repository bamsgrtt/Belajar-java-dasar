package Perulangan;

public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "bambang", "sugiarto" , "genjieh",
                "software engineer" ,"2030"
        };
        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("FOR EACH");

        for (var name: names){ // : setelah variable
            System.out.println(name);
        }

    }
}
