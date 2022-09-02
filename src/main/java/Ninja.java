public class Ninja {
    private String nome;
    private int chakraInicial;
    private Jutsu jutsuPrincipal;

    public Ninja(String nome, Jutsu jutsuPrincipal){
        this.chakraInicial = 100;
        this.nome = nome;
        this.jutsuPrincipal = jutsuPrincipal;
    }
    public void atacar(Ninja ninjaOponente){
        ninjaOponente.receberGolpe(this.jutsuPrincipal.getDano());
        this.chakraInicial = this.chakraInicial - this.jutsuPrincipal.getChakraConsumido();
    }
    public void receberGolpe(int danoRecebido){
        this.chakraInicial = this.chakraInicial - danoRecebido;
    }

    public String getNome() {
        return nome;
    }
    public int getChakraInicial() {
        return chakraInicial;
    }
}
