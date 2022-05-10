public abstract class PlanoDecorator implements Plano {
    private Plano plano;
    public String nome;

    public PlanoDecorator(Plano plano) {
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getComponentes();


    @Override
    public String getEstrutura() {
        return getComponentes() + " " + this.plano.getEstrutura();
    }
}
