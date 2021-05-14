public class Contador{

    int valorInicial;
    int valorFinal;
    int valorIncremento;
    


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

    public boolean incremento() {
        int valorActual = valorInicial;
        valorActual = valorIncremento + valorInicial;

        if (valorActual > valorFinal){
            return true;
        } else {
            return false;
        }

    }





}