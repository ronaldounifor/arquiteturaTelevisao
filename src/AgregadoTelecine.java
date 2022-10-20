public class AgregadoTelecine implements Agregado {
    private Canal[] canais;

    public AgregadoTelecine() {
        canais = new Canal[3];

        canais[0] = new Canal(120, "Telecine Action");
        canais[1] = new Canal(121, "Telecine Pipoca");
        canais[2] = new Canal(122, "Telecine Cult");
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorVetor(canais);
    }
}
