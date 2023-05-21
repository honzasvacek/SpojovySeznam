import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadejte cisla: ");

        Scanner sc = new Scanner(System.in);

        int hodnota = sc.nextInt();

        Prvek tail = new Prvek(hodnota, null); //první hodnota je zároveň i tail = konec
        
        Prvek head = tail; //uložím si první prvek = head

        boolean cti = true;

        while(cti) {
            //čtu dokud nenarazím na nulu a vytvářím prvky
            hodnota = sc.nextInt();
            if (hodnota == 0) {
                cti = false;
            } else {
                Prvek novyPrvek = new Prvek(hodnota, null); //nový prvek zatím nenavazuje nikoho

                tail.dalsiPrvek = novyPrvek; //na tail navážu nový prvek

                tail = novyPrvek; //tail je teď ten nový prvek
            }
        }
        System.out.println("Spojovy seznam: ");

        //výpis seznamu
        while(head != null) {
            System.out.println(head.hodnota);
            head = head.dalsiPrvek;
        }

    }
}