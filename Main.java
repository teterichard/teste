//
// Árvore AVL (Rotações) - Exemplo de implementação em Java
// Copyright (C) 2024 André Kishimoto
//
// Maria da Silva - RA: 12345678
// Referências: slides da aula, documentação Java, ChatGPT
//

import ed2.AVL;
import ed2.Node;

public class Main {

    public static void main(String[] args) {
        AVL avl = new AVL();

        System.out.println("Item a");
        System.out.println("----- Inserção 1, 2, 3 ==> Rotação para Esquerda -----");
        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        // printTree(avl);

        avl.clear();

        System.out.println("Item b");
        System.out.println("----- Inserção 3, 2, 1 ==> Rotação para Direita -----");
        avl.insert(3);
        avl.insert(2);
        avl.insert(1);
        // printTree(avl);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        avl.clear();

        System.out.println("Item c");
        System.out.println("----- Inserção 3, 1, 2 ==> Rotação Esquerda-Direita -----");
        avl.insert(3);
        avl.insert(1);
        avl.insert(2);
        // printTree(avl);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        avl.clear();

        System.out.println("Item d");
        System.out.println("----- Inserção 1, 3, 2 ==> Rotação Direita-Esquerda -----");
        avl.insert(1);
        avl.insert(3);
        avl.insert(2);
        // printTree(avl);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        avl.clear();

        System.out.println("Item e");
        System.out.println("----- Inserção 5, 4, 3, 1, 2, 6, 7, 9, 8 -----");
        int[] values = {5, 4, 3, 1, 2, 6, 7, 9, 8};
        for (int v : values) {
            avl.insert(v);
        }
        // printTree(avl);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        System.out.println("Item f");
        System.out.println("----- Remoção do nó 4 -----");
        avl.remove(4);
        // printTree(avl);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        System.out.println("Item g");
        System.out.println("----- Remoção do nó 5 -----");
        avl.remove(5);
        // printTree(avl);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        System.out.println("Item h");
        System.out.println("----- Remoção do nó 1 -----");
        avl.remove(1);
        // printTree(avl);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

    }

    private static void printTree(AVL tree) {
        System.out.println("Em ordem: \n" + tree.inReversedOrderAscii());
        System.out.println("Por nível: \n" + tree.levelOrderTraversal());
        System.out.println("Dados dos nós:");
        printNodeDetails(tree.getRoot());
        System.out.println();
    }

    private static void printNodeDetails(Node node) {
        if (node == null) return;
        printNodeDetails(node.getLeft());
        System.out.println("Nó " + node.getData() +
                " | Pai: " + (node.getParent() != null ? node.getParent().getData() : "null") +
                " | Esq: " + (node.getLeft() != null ? node.getLeft().getData() : "null") +
                " | Dir: " + (node.getRight() != null ? node.getRight().getData() : "null") +
                " | BF: " + node.getBalanceFactor());
        printNodeDetails(node.getRight());
    }
}