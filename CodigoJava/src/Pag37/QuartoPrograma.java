// Página 37 - Código 3. Classe QuartoPrograma.
// Página 40 - Código 5. Classe QuartoPrograma utilizando atributo da classe Matemática
// Página 40 - Código 5. Classe QuartoPrograma utilizando atributo da classe Matemática
// Página 42 - Código 8. Classe QuartoPrograma utilizando pacote Apoio.
// Página 46 - Código 11. QuartoPrograma.java.

package Pag37;

import Pag37.Apoio.Matematica;

public class QuartoPrograma {
    
    public static void main(String args[]) {
        
        Matematica m=new Matematica();
            m.soma(5,10);
            System.out.println("Resultado: "+m.getResultado());

            m.multiplica(5,10);
            System.out.println("Resultado: "+m.getResultado());
    }
}
