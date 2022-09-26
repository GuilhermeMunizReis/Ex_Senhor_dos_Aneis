public class Anao extends Habitante implements Mineracao{
    private float altura;
    private String reino;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.format("Altura: %.2f\n", this.getAltura());
        System.out.println("Reino: " + this.getReino());
    }

    @Override
    public void minerar() {
        System.out.println(this.getNome() + " esta minerando!!!");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
