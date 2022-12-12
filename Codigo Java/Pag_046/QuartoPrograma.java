// Página 46 - Código 11. QuartoPrograma.java.

import Apoio.Matematica;

public class QuartoPrograma {
    
    public static void main(String args[]) {
        
        Matematica m=new Matematica();
            int resultado;
            m.soma(5,10);
            System.out.println("Resultado: "+m.getResultado);

            m.multiplica(5,10);
            System.out.println("Resultado: "+m.getResultado);
    }
}
