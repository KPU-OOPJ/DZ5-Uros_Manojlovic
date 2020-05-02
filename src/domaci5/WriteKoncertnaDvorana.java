
package domaci5;

import java.io.File;
import java.io.PrintWriter;


public class WriteKoncertnaDvorana {
    public static void main (String[] args) {
        KoncertnaDvorana kd = new KoncertnaDvorana(40);
        kd.uvediGledaoca(0);
        kd.uvediGledaoca(19);
        kd.uvediGledaoca(39);
        boolean provera;
        provera = kd.proveraSedista();
        kd.izracunajZaradu();
        File file = new File ("C:\\Users\\Uros\\Desktop\\koncertnaDvorana.txt");
        try {
        PrintWriter printWriter = new PrintWriter (file);
        printWriter.println (kd.dohvatiZaraduDvorane().dohvatiZaradu());
        printWriter.println (provera);
        printWriter.close ();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
