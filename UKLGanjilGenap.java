import java.util.Scanner;

public class UKLGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new
        Scanner (System.in);

        System.out.println("Masukan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();
        input.close();

        if (bilangan % 2 == 0) {
            System.out.println("-----------------------------------------------");
            System.out.println("Hasil : Bilangan " + bilangan + " adalah GENAP");

        
        } else {
            System.out.println("------------------------------------------------");
            System.out.println("Hasil : Bilangan "+ bilangan + " adalah GANJIL");
        }


    }
    
}
