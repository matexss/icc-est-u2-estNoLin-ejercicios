package main.Ejercicio_03_listLeves;

import java.util.*;
import main.Materia.Models.Node;

/**
 * Clase que lista los nodos de un árbol binario por niveles.
 */
public class ListLevels {

    /**
     * Devuelve una lista de listas, donde cada sublista contiene los nodos de un nivel del árbol.
     * @param root Nodo raíz del árbol.
     * @return Lista de niveles con nodos.
     */
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                level.add(node);

                if (node.getLeft() != null) queue.offer(node.getLeft());
                if (node.getRight() != null) queue.offer(node.getRight());
            }

            result.add(level);
        }

        return result;
    }
}
