//
// Árvore AVL (Rotações) - Exemplo de implementação em Java
// Copyright (C) 2024 André Kishimoto
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.
//
// Carolyne Gomes Silva - RA: 10436604
// Maria Teresa Richard Dias - RA: 10386449
//

package ed2;

public class Node {

	protected int data;
	private int balanceFactor;
	protected Node parent;
	protected Node left;
	protected Node right;

	public Node() {
		this(0, null);
	}

	public Node(int data) {
		this(data, null);
	}

	public Node(int data, Node parent) {
		this.data = data;
		this.balanceFactor = 0;
		this.parent = parent;
		this.left = null;
		this.right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
		
		if (this.left != null) {
			this.left.setParent(this);
		}

		updateBalanceFactor();
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
		
		if (this.right != null) {
			this.right.setParent(this);
		}
		
		updateBalanceFactor();
	}

	public boolean hasLeftChild() {
		return left != null;
	}

	public boolean hasRightChild() {
		return right != null;
	}

	public boolean isRoot() {
		return parent == null;
	}

	public boolean isLeaf() {
		return left == null && right == null;
	}

	public int getDegree() {
		int degree = 0;
		
		if (hasLeftChild()) {
			++degree;
		}
		
		if (hasRightChild()) {
			++degree;
		}
		
		return degree;
	}

	public int getLevel() {
		if (isRoot()) {
			return 0;
		}

		return parent.getLevel() + 1;
	}

	public int getHeight() {
		if (isLeaf()) {
			return 0;
		}

		int height = 0;
		
		if (hasLeftChild()) {
			height = Math.max(height, left.getHeight());
		}
		
		if (hasRightChild()) {
			height = Math.max(height, right.getHeight());
		}
		
		return height + 1;
	}

	public int getBalanceFactor() {
		return balanceFactor;
	}

	private void updateBalanceFactor() {
		int leftHeight = hasLeftChild() ? left.getHeight() : -1;
		int rightHeight = hasRightChild() ? right.getHeight() : -1;
		balanceFactor = rightHeight - leftHeight;
	}

	@Override
	public String toString() {
		return "data: " + data
				+ ", parent: " + (parent != null ? parent.getData() : "null")
				+ ", left: " + (left != null ? left.getData() : "null")
				+ ", right: " + (right != null ? right.getData() : "null")
				+ ", isRoot(): " + isRoot()
				+ ", isLeaf(): " + isLeaf()
				+ ", getDegree(): " + getDegree()
				+ ", getLevel(): " + getLevel()
				+ ", getHeight(): " + getHeight()
				+ ", getBalanceFactor(): " + getBalanceFactor();
	}

}
