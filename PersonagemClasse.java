public class PersonagemClasse {
    private String classe;

    public PersonagemClasse(String classe) {
        this.classe = classe;
    }

    public void mostrarStatus(String nome, int level) {
        System.out.println("personagem " + nome + "(level " + level + ") possui a classe: " + classe);
    }
}