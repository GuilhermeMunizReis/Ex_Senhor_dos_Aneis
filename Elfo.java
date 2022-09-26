public class Elfo extends Habitante implements Cura{
    private String tribo;

    public void viajar(){
        System.out.println(this.getNome() + " esta viajando!");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo: " + this.getTribo());
    }

    @Override
    public void curar() {
        System.out.println(this.getNome() + " esta curando!");
    }

    public String getTribo() {
        return tribo;
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }
}
