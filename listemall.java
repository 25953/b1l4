import java.util.Scanner;

public class listemall {

    public static void main(String[] args) {

        int[] arraylist;
        Scanner reader = new Scanner(System.in);

        String[] arrayliststring = new String[3];

        arrayliststring[0] = "niks misschien kies ja of nee ;-)";

        arrayliststring[1] = "hahah mag niet ;)";

        arrayliststring[2] = "ga maar een boek lezen :)";

        System.out.println("zin om te gamen?? 0=misschien 1=ja 2=nee kies maar.");

        int Answer = reader.nextInt();
        reader.close();

        if (Answer == 0){
            System.out.println(arrayliststring[0]);
        }

        if (Answer == 1){
            System.out.println(arrayliststring[1]);
        }

        if (Answer == 2){
            System.out.println(arrayliststring[2]);
        }

        if (Answer >=3){
            System.out.println("hoger dan 2 is geen optie");
        }

        if (Answer <= -1){
            System.out.println("zeg makker dat mag niet he ;)");
        }

        System.out.println("en zo is het");

    }
}
