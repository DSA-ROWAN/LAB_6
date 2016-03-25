public class BinaryNode<T extends Comparable<T>> {
	BinaryNode<T> parent = null;
	BinaryNode<T> right = null;
	BinaryNode<T> left = null;
	T value = null;
	int balance = 0;
	
	public BinaryNode(T item){
		value = item;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setValue(T val){
		value = val;
	}
	
	public BinaryNode<T> getParent(){
		return parent;
	}
	
	public BinaryNode<T> getRight(){
		return right;
	}
	
	public BinaryNode<T> getLeft(){
		return left;
	}
	
	public int balance(){
		return balance;
	}
	
	public BinaryNode<T> setParent(BinaryNode<T> bNode){
		return parent = bNode;
	}
	
	public BinaryNode<T> setRight(BinaryNode<T> bNode){
		return right = bNode;
	}

	public BinaryNode<T> setLeft(BinaryNode<T> bNode){
		return left = bNode;
	}
	
	public int setBalance(int bal){
		return balance = bal;
	}
}
