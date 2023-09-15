package classes;

public class ContagemIterativa {
    public static int contarOcorrenciasIterativas(int[] V, int D) {
        int ocorrencias = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] == D) {
                ocorrencias++;
            }
        }
        return ocorrencias;
    }
}
