import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {
      int acilis = 10;
      float basina = 2.20f;
      float km ;
      Scanner uc = new Scanner(System.in);
        System.out.println("Kaç km yol gidiceksiniz?: ");
        km = uc.nextFloat();
        float ucret = (km * basina) + acilis <20 ? 20 : (km * basina) + acilis;
        System.out.println("Ödemeniz gereken tutar: "+ ucret);



    }
}
