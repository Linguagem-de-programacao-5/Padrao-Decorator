public class PlanoInternet extends PlanoDecorator{

    public PlanoInternet(Plano plano) {
        super(plano);
    }

    @Override
    public String getComponentes() {
        return "Plano = 100 mbps";
    }
}
