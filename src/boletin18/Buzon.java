package boletin18;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Buzon {

    public int numeroDeCorreos(ArrayList<Correo> correos) {
        int n=correos.size();
        System.out.println("Numero total de correos "+n);
        return (n);
    }

    public void engade(Correo c,ArrayList<Correo> correos) {
        correos.add(c);

    }

    public boolean porLer(ArrayList<Correo> correos) {
        boolean respuesta=false;
        for (int i=0; i<correos.size(); i++) {
            if (correos.get(i).isVerificado()==(false)) {
                respuesta=true;
            }
            else {
                respuesta=false;

            }
        }
        return (respuesta);
    }

    public String amosaPrimerNoLeido(ArrayList<Correo> correos) {
       
        String correo=" ";
        for (int i=0; i<correos.size(); i++) {
            if (correos.get(i).isVerificado()==(false)) {
                correo=correos.get(i).getContido();
                break;
            }

        }
        return (correo);
    }

    public String amosarCorreoDet(ArrayList<Correo> correos) {
        String correo=" ";
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Introducir Numero"));
        correo=correos.get(x).getContido();
        return correo;
    }

    public void borrar(ArrayList<Correo> correos) {
        int borrado=Integer.parseInt(JOptionPane.showInputDialog("Correo que quieres borrar"));
        correos.remove(borrado-1);
        }

    }

