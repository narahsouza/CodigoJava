// Página 42 - Código 8. Classe QuartoPrograma utilizando pacote Apoio.

import Apoio.Matematica;

public class QuartoPrograma {
    
    public static void main(String args[]) {
        
        Matematica m=new Matematica();
            int resultado;
            m.soma(5,10);
            System.out.println("Resultado: "+m.resultado);

            m.multiplica(5,10);
            System.out.println("Resultado: "+m.resultado);
    }
}
