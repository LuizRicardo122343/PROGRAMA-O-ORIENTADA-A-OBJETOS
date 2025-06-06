package App4;

public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(){
    }

    // Construtor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // M�todos getters e setters
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

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // M�todo para imprimir tudo
    public String imprimir() {
        return "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo;
    }
}
