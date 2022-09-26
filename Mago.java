public class Mago extends Habitante implements Cura, Feitico{
    private String cor;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: " + this.getCor());
    }

    @Override
    public void curar() {
        System.out.println(this.getNome() + " esta curando!");
    }

    @Override
    public void lancaFeitico() {
        System.out.println(this.getNome() + " lancou um feitico !!!");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
