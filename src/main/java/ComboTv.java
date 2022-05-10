public class ComboTv extends PlanoDecorator{
    public ComboTv(Plano plano) {
        super(plano);
    }

    @Override
    public String getComponentes() {
        return "+ canais abertos + HBO max" ;
    }
}
