package predavanje13;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class VelikostSlike {

    public static void main(String[] args) {
        String ime = "src/predavanje12/medo.png";
        try {
            FileInputStream fis = new FileInputStream(ime);
            DataInputStream dis = new DataInputStream(fis);

            byte[] prvaVrstica = new byte[16];
            dis.read(prvaVrstica);


            int sirina = dis.readInt();
            int visina = dis.readInt();

            System.out.printf("%d x %d", sirina, visina);

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}