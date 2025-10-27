//
// Árvore AVL (Rotações) - Exemplo de implementação em Java
// Copyright (C) 2024 André Kishimoto
//
// Carolyne Gomes Silva - RA: 10436604
// Maria Teresa Richard Dias - RA: 10386449
//Anna Carolina Rezende Garrido - RA: 10443894 
// Referências: slides da aula e site https://www.happycoders.eu/algorithms/avl-tree-java/
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

        avl.clear();

        System.out.println("Item b");
        System.out.println("----- Inserção 3, 2, 1 ==> Rotação para Direita -----");
        avl.insert(3);
        avl.insert(2);
        avl.insert(1);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        avl.clear();

        System.out.println("Item c");
        System.out.println("----- Inserção 3, 1, 2 ==> Rotação Esquerda-Direita -----");
        avl.insert(3);
        avl.insert(1);
        avl.insert(2);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        avl.clear();

        System.out.println("Item d");
        System.out.println("----- Inserção 1, 3, 2 ==> Rotação Direita-Esquerda -----");
        avl.insert(1);
        avl.insert(3);
        avl.insert(2);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        avl.clear();

        System.out.println("Item e");
        System.out.println("----- Inserção 5, 4, 3, 1, 2, 6, 7, 9, 8 -----");
        int[] values = {5, 4, 3, 1, 2, 6, 7, 9, 8};
        for (int v : values) {
            avl.insert(v);
            // System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());

        }
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        System.out.println("Item f");
        System.out.println("----- Remoção do nó 4 -----");
        avl.remove(4);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        System.out.println("Item g");
        System.out.println("----- Remoção do nó 5 -----");
        avl.remove(5);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

        System.out.println("Item h");
        System.out.println("----- Remoção do nó 1 -----");
        avl.remove(1);
        System.out.println("Em ordem: \n" + avl.inReversedOrderAscii());
		System.out.println("Por nível: \n" + avl.levelOrderTraversal());

    }

}
