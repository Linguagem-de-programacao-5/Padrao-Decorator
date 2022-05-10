public class ComboTelefone extends PlanoDecorator{
    public ComboTelefone(Plano plano) {
        super(plano);
    }

    @Override
    public String getComponentes() {
        return "+ combo Tel 100 min fixo";
    }
}
