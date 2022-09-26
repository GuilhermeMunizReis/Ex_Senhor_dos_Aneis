public class Main {
    public static void main(String[] args) {
        TerraMedia terraMedia = new TerraMedia();

        Anao a = new Anao();
        Elfo e = new Elfo();
        Mago m = new Mago();

        Arma arma = new Arma();

        arma.setNome("Gugnir");
        arma.setMagica(true);

        a.setNome("Gimli");
        a.setEnergia(81.4f);
        a.setIdade(60);
        a.setAltura(1.42f);
        a.setReino("Sociedade do Anel");
        a.arma = arma;

        e.setNome("Legolas");
        e.setEnergia(74.1f);
        e.setIdade(2931);
        e.setTribo("Tribo Elfica");
        e.arma = arma;

        m.setNome("Gandalf");
        m.setEnergia(214.7f);
        m.setIdade(70);
        m.setCor("Cinza");
        m.arma = arma;

        terraMedia.addHabitante(a);
        terraMedia.addHabitante(e);
        terraMedia.addHabitante(m);

        terraMedia.listarHabitantes();
    }
}
