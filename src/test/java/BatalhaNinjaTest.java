import org.junit.Assert;
import org.junit.Test;

public class BatalhaNinjaTest {
    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        Assert.assertEquals(nivelChakraEsperado, ninjaOponente.getChakraInicial(), 0.01);
    }

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakraParaAtacar() {
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);

    }
    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi(){
        Jutsu jutsuNinjaUm = new Jutsu(5, 8);
        Ninja ninjaUm = new Ninja("Itachi", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);
    }
    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi(){
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Gaara", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("Itachi", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaDois, ninjaVencedor);
    }
    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar(){
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Gaara", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("Naruto", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);
    }
    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra(){
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Gaara", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("Naruto", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);
    }
}