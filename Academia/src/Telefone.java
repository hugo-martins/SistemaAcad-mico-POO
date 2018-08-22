public class Telefone {

    private int numero;
    private int dd;

    public Telefone(int numero, int dd) {
        this.numero = numero;
        this.dd = dd;
    }
    public Telefone() {
        this.numero = 0;
        this.dd = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getDd() {
        return dd;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

}
