import java.util.HashMap;
import java.util.Map;

public class FabricaPersonagem {
    private Map<String, PersonagemClasse> personagemClasseMap = new HashMap<>();

    public PersonagemClasse getPersonagemClasse(String classe) {
        String key = classe;

        personagemClasseMap.putIfAbsent(key, new PersonagemClasse(classe));
        return personagemClasseMap.get(key);
    }
}
