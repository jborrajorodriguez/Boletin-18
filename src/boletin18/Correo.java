package boletin18;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Correo {
    private String contido;
    private boolean verificado;

    public Correo() {
    }

    public Correo(String contido,boolean verificado) {
        this.contido=contido;
        this.verificado=verificado;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido=contido;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado=verificado;
    }

}
