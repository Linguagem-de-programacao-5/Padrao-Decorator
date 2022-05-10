import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoTest {

    @Test
    void deveRetornarPlanoInternet(){
        Plano plano = new PlanoInternet(new PlanoB2C());
        assertEquals("Plano = 100 mbps / Categoria B2C", plano.getEstrutura());
    }

    @Test
    void deveRetornarPlanoInternetComboTv(){
        Plano plano =  new PlanoInternet(new ComboTv(new PlanoB2C()));
        assertEquals("Plano = 100 mbps + canais abertos + HBO max / Categoria B2C", plano.getEstrutura());
    }

    @Test
    void deveRetornarPlanoInternetComboTelefone(){
        Plano plano =  new PlanoInternet(new ComboTelefone(new PlanoB2C()));
        assertEquals("Plano = 100 mbps + combo Tel 100 min fixo / Categoria B2C", plano.getEstrutura());
    }
    @Test
    void deveRetornarPlanoInternetComboTvComboTelefone(){
        Plano plano =  new PlanoInternet(new ComboTv(new ComboTelefone(new PlanoB2C())));
        assertEquals("Plano = 100 mbps + canais abertos + HBO max + combo Tel 100 min fixo / Categoria B2C", plano.getEstrutura());
    }
}