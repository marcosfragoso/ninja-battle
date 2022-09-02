public class Jutsu {
    private int chakraConsumido;
    private int dano;

    public Jutsu(int chakraConsumido, int dano){
        if(chakraConsumido <= 0 || chakraConsumido > 5) {
            throw new IllegalArgumentException();
        } else {
            this.chakraConsumido = chakraConsumido;
        }
        if(dano <= 0 || dano > 10){
            throw  new IllegalArgumentException();
        } else {
            this.dano = dano;
        }
    }
    public int getChakraConsumido() {
        return chakraConsumido;
    }
    public int getDano() {
        return dano;
    }
}

