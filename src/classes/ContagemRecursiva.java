package classes;

public class ContagemRecursiva {

    public static int contarOcorrenciasRecursivas(int[] V, int D) {
        return contarOcorrenciasRecursivas(V, D, 0, V.length - 1);
    }

    private static int contarOcorrenciasRecursivas(int[] V, int D, int inicio, int fim) {
        if (inicio > fim) {
            return 0;
        }

        int meio = (inicio + fim) / 2;
        if (V[meio] == D) {
            return 1 + contarOcorrenciasRecursivas(V, D, inicio, meio - 1) +
                    contarOcorrenciasRecursivas(V, D, meio + 1, fim);
        } else if (V[meio] < D) {
            return contarOcorrenciasRecursivas(V, D, meio + 1, fim);
        } else {
            return contarOcorrenciasRecursivas(V, D, inicio, meio - 1);
        }
    }
}
