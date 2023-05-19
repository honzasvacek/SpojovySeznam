import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadejte cisla: ");

        Scanner sc = new Scanner(System.in);

        int hodnota = sc.nextInt();

        Prvek hlava = new Prvek(hodnota, null);

        Prvek start = hlava;

        while(hodnota != 0) {
            //čtu dokud nenarazím na nulu a vytvářím prvky
            Prvek novyPrvek = new Prvek(hodnota, null);

            hlava.dalsiPrvek = novyPrvek;

            hlava = novyPrvek;

            hodnota = sc.nextInt();
        }
        System.out.println("Spojovy seznam:");

        //výpis seznamu
        while(start.dalsiPrvek != null) {
            start = start.dalsiPrvek;

            System.out.println(start.hodnota);
        }

    }
}