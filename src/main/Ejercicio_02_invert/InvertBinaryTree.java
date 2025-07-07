package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

/**
 * Clase para invertir un árbol binario (espejo).
 */
public class InvertBinaryTree {

    /**
     * Invierte un árbol binario, intercambiando hijos izquierdos y derechos.
     * @param root Nodo raíz original.
     * @return Nodo raíz del árbol invertido.
     */
    public Node invertTree(Node root) {
        if (root == null) return null;

        Node left = invertTree(root.getLeft());
        Node right = invertTree(root.getRight());

        root.setLeft(right);
        root.setRight(left);

        return root;
    }
}
