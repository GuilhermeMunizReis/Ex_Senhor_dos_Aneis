public class TerraMedia {
    private Habitante[] herois = new Habitante[100];        // Array contendo os habitantes

    // Adiciona um habitante na terra media
    public void addHabitante(Habitante habitante){
        boolean ver = false;
        for (int i = 0; i < herois.length; i++) {
            if(herois[i] == null){
                herois[i] = habitante;
                ver = true;
                break;
            }
        }

        if(ver == false)
            System.out.println("Nao eh possivel adicionar o habitante");
    }

    public void listarHabitantes(){
        for (Habitante h: herois) {
            if(h != null){
                h.atacar();
                if(h instanceof Anao){
                    Anao aux = (Anao) h;
                    aux.minerar();
                }
                else if(h instanceof Elfo){
                    Elfo aux = (Elfo)h;
                    aux.curar();
                }
                else if(h instanceof Mago){
                    Mago aux = (Mago) h;
                    aux.curar();
                    aux.lancaFeitico();
                }
                h.mostraInfo();

            }
        }
    }
}