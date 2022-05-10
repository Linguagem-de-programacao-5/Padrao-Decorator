public class PlanoB2C implements Plano{
    String nomePlano;

    public PlanoB2C() {
    }

    public PlanoB2C(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    @Override
    public String getEstrutura() {
        return "/ Categoria B2C";
    }
}
