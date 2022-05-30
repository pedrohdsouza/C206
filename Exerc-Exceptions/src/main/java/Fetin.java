import br.inatel.cdg.exceptions.Checked;
import br.inatel.cdg.exceptions.UnChecked;

import java.util.HashMap;
import java.util.Map;

public class Fetin {

    Map<String, Double> projetos = new HashMap<String, Double>();

    void adicionaProjeto(String nome, double nota) throws Checked {
        if (projetos.containsKey(nome)) {
            throw new UnChecked("Nome do projeto repetido");
        }
        if (nota >= 60) {
            projetos.put(nome, nota);
        }
        else {
            throw new Checked("Nota insuficiente");
        }
    }
}
