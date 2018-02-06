package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin18 {

    public static void main(String[] args) {
        Buzon b=new Buzon();
        ArrayList<Correo> buz=new ArrayList();
        Correo a=new Correo("FALSO",false);
        buz.add(a);
        buz.add(1,new Correo("asd",false));
        buz.add(2,new Correo("qwe",false));
        buz.add(3,new Correo("rty",false));
        buz.add(4,new Correo("uyty",true));
        b.numeroDeCorreos(buz); 
        if(b.porLer(buz)==true){
            System.out.println("Tdos los correos leidos");
        }else System.out.println("Hay correos sin leer");
        
        //System.out.println(b.amosaPrimerNoLeido(buz));
        System.out.println(b.amosarCorreoDet(buz));
        b.borrar(buz);
        b.numeroDeCorreos(buz);

    }

}
