import java.util.ArrayList;

public class Guia {
    public static void main(String[] args) {
        ArrayList<Iterador> pacotes = new ArrayList<>();
        pacotes.add(new AgregadoESPN().criarIterador());
        pacotes.add(new AgregadoTelecine().criarIterador());

        for (Iterador iterador: pacotes) {
            while(iterador.hasNext()) {
                Canal canalAtual = iterador.next();
                System.out.println(canalAtual.getNumero() + ". " + canalAtual.getNome());
            }
        }
    }
}
