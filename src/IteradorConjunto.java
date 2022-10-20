import java.util.HashSet;

public class IteradorConjunto implements Iterador {
    private HashSet<Canal> canais;

    @Override
    public Canal next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
