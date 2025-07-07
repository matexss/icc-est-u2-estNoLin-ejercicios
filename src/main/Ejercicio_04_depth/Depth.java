package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

/**
 * Clase que calcula la profundidad máxima de un árbol binario.
 */
public class Depth {

    /**
     * Calcula la longitud del camino más largo desde la raíz hasta una hoja.
     * @param root Nodo raíz.
     * @return Profundidad máxima.
     */
    public int maxDepth(Node root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
