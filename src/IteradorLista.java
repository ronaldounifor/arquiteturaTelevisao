import java.util.ArrayList;

public class IteradorLista implements Iterador {
    private ArrayList<Canal> canais;
    private int canalAtual;

    public IteradorLista(ArrayList<Canal> canais) {
        this.canais = canais;
        this.canalAtual = -1;
    }

    @Override
    public Canal next() {
        return canais.get(++canalAtual);
    }

    @Override
    public boolean hasNext() {
        int proximo = canalAtual + 1;
        if(proximo < canais.size() && canais.get(canalAtual + 1) != null)
            return true;

        return false;
    }
}
