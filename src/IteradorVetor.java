public class IteradorVetor implements Iterador {
    private Canal[] canais;
    private int canalAtual;

    public IteradorVetor(Canal[] canais) {
        this.canais = canais;
        this.canalAtual = -1;
    }

    @Override
    public Canal next() {
        return canais[++canalAtual];
    }

    @Override
    public boolean hasNext() {
        int proximo = canalAtual + 1;
        if(proximo < canais.length && canais[proximo] != null)
            return true;

        return false;
    }
}
