public class FlyweightPersonagem {
    public static void main(String[] args) {
        FabricaPersonagem fabricaPersonagem = new FabricaPersonagem();

        Personagem ladino = new Personagem("ladino", 22, fabricaPersonagem.getPersonagemClasse("ladino"));
        Personagem guerreiro = new Personagem("guerreiro", 18, fabricaPersonagem.getPersonagemClasse("guerreiro"));
        Personagem arqueiro = new Personagem("arqueiro", 20, fabricaPersonagem.getPersonagemClasse("arqueiro"));
        Personagem ladino2 = new Personagem("ladino2", 25, fabricaPersonagem.getPersonagemClasse("ladino"));

        System.out.println("\n");
        guerreiro.mostrarStatus();
        ladino.mostrarStatus();
        arqueiro.mostrarStatus();
        ladino2.mostrarStatus();
        fabricaPersonagem.printTamanhoMap();
    }
}