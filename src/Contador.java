public class Contador{

    int valorInicial = 0;
    int valorFinal = 0;
    int valorIncremento = 0;


    public Contador(int valorInicial, int valorFinal, int valorIncremento) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.valorIncremento = valorIncremento;
    }

    public Contador(int valorFinal){
        this.valorIncremento = 1;
        this.valorInicial = 0;
        this.valorFinal = valorFinal;
    }

    public int get_valorInicial() {
        return valorInicial;
    }


    public int getValorFinal() {
        return valorFinal;
    }

    public int getValorIncremento() {
        return valorIncremento;
    }

    public int NumeroObligado(int valorFinal2) {
        this.valorFinal = valorFinal2;
        return valorFinal;
    }







}