import List.LinkedList;

//THIS DOES NOT NEED TO BE BALANCED!!! (AVL)

public class BinarySearchTree<T extends Comparable<T>> {
	private BinaryNode<T> root = null;
	private int size = 0;
	
	public BinarySearchTree(){
		
	}
	
	public BinaryNode<T> root(){
		return root;
	}
	
	public boolean isEmpty(){
		if(root == null) return true;
		return false;
	}
	
	public void clear(){
		root = null;
	}
	
	
	public void insert(T item) throws Exception{
		if(this.isEmpty()){
			this.root = new BinaryNode<T>(item);
			size++;
			return;
		}else{
			BinaryNode<T> curr = this.root();
			boolean done = false;
			
			BinaryNode<T> newNode = null;
			
			while(!done){
				int comp = item.compareTo(curr.getValue());
				
				if(comp == 0){
					throw new Exception();
				}
				
				if(comp < 0){
					if(curr.getLeft() == null){
						curr.setLeft(newNode);
						done = true;
					}else{
						curr = curr.getLeft();
					}
				}else{
					if(root.right == null){
						root.setRight(newNode);
						done = true;
					}else{
						curr = curr.getRight();
					}
				}
			}
			newNode = new BinaryNode<T>(item);
			newNode.setParent(curr);
			size++;
		}
	}
	
	
	protected BinaryNode<T> search(Comparable<T> item){
		if(this.isEmpty()) return null;
		return this.recursiveSearch(this.root(), item);
		
	}
	
	private BinaryNode<T> recursiveSearch(BinaryNode<T> node, Comparable<T> item){
		if(node == null) return null;
		int comp = item.compareTo(node.getValue());
		if(comp == 0) return node;
		
		if(comp < 0){
			return recursiveSearch(node.getLeft(), item);
		}else{
			return recursiveSearch(node.getRight(), item);
		}
	}
	
	
	public LinkedList<T> inOrder(){
		LinkedList<T> lst = new LinkedList<T>();
		this._inOrder(this.root, lst);
		return lst;
	}
	
	private void _inOrder(BinaryNode<T> node, LinkedList<T> lst){
		if(node != null){
			this._inOrder(node.getLeft(), lst);
			lst.add(node.value);
			this._inOrder(node.getRight(), lst);
		}
	}	
}
