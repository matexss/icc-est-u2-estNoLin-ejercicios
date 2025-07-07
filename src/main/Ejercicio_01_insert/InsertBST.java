package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

/**
 * Clase que implementa la inserción en un Árbol Binario de Búsqueda (BST).
 */
public class InsertBST {

    /**
     * Inserta un valor en un árbol binario de búsqueda de forma recursiva.
     * @param node Nodo raíz actual.
     * @param value Valor a insertar.
     * @return Nodo raíz actualizado con el nuevo valor insertado.
     */
    public Node insert(Node node, int value) {
        if (node == null) return new Node(value);
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        return node;
    }
}
