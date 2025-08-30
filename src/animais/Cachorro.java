package animais;

public class Cachorro implements Animal {

    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + nome + " faz Au - Au");
    }
}
