import java.util.Objects;

public class Batalha {
    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja){
        primeiroNinja.atacar(segundoNinja);
        segundoNinja.atacar(primeiroNinja);
        primeiroNinja.atacar(segundoNinja);
        segundoNinja.atacar(primeiroNinja);
        primeiroNinja.atacar(segundoNinja);
        segundoNinja.atacar(primeiroNinja);
        if (Objects.equals(primeiroNinja.getNome(), "Itachi")) {
            return primeiroNinja;
        } else {
            if (Objects.equals(segundoNinja.getNome(), "Itachi")) {
                return segundoNinja;
            } else {
                if (segundoNinja.getChakraInicial() > primeiroNinja.getChakraInicial()) {
                    return segundoNinja;
                } else {
                    return primeiroNinja;
                }
            }
        }
    }

}
