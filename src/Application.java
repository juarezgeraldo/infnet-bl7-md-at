import classes.ContagemIterativa;
import classes.ContagemRecursiva;

public class Application {
    public static void main(String[] args) {

        int[] V = {1, 2, 3, 4, 4, 4, 5, 6};
        int D = 4;
        int ocorrenciasRecursivas = ContagemRecursiva.contarOcorrenciasRecursivas(V, D);
        System.out.println("Ocorrências de " + D + ": " + ocorrenciasRecursivas);

        int ocorrenciasIterativas = ContagemIterativa.contarOcorrenciasIterativas(V, D);
        System.out.println("Ocorrências de " + D + ": " + ocorrenciasIterativas);

    }


}
