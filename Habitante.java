public abstract class Habitante {
    public static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    public Arma arma;

    public Habitante(){
        contador++;
    }

    public void atacar() {
        if (this.arma != null) {
            if (this.arma.isMagica() == false && this.energia >= 10) {
                System.out.println(this.nome + " atacou com " + this.arma.getNome());
                this.energia -= 10;
            }
            else if(this.arma.isMagica() == true && this.energia >= 20) {
                this.energia -= 20;
            }
        }
    }


    public void mostraInfo(){
        System.out.println(this.getId() + " - " + this.getNome());
        System.out.format("Energia: %.2f\t\tIdade: %d\n", this.getEnergia(), this.getIdade());
        System.out.println(this.arma.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public int getId() {
        return id;
    }

}
