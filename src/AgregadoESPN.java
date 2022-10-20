import java.util.ArrayList;

public class AgregadoESPN implements Agregado {
    private ArrayList<Canal> canais;

    public AgregadoESPN() {
        canais = new ArrayList<>();
        canais.add(new Canal(44, "ESPN 1"));
        canais.add(new Canal(45, "ESPN 2"));
        canais.add(new Canal(46, "ESPN HD"));
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorLista(canais);
    }
}
