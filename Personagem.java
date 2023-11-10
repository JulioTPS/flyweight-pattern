public class Personagem {
    private String nome;
    public int level;
    PersonagemClasse personagemClasse;

    public Personagem(String nome, int level, PersonagemClasse personagemClasse) {
        this.nome = nome;
        this.level = level;
        this.personagemClasse = personagemClasse;
    }

    public void mostrarStatus() {
        personagemClasse.mostrarStatus(nome, level);
    };
}