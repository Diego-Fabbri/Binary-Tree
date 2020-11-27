
public class Node {
//NB:La classe nodo di un albero di modifica . Adesso ogni nodi ha due puntatori a due nodi figli oltre a parte informativa
	private int info;//contenuto informativo del nodo padre
	private Node left;//contenuto informativo del nodo figlio sinistro
	private Node right;//contenuto informativo del nodo figlio destro
	
	public Node(int info) {//costruttore che riceve solo contenuto informativo
		this.info  = info;
		this.left  = null;// non si settano nodi figli; il nodo cos� definito sar� una foglia 
		this.right = null;
	}
	
	public Node(int info, Node left, Node right) {//costruttore che setta contenuto informativo del nodo e punta ai due nodi figli
		this.info  = info;
		this.left  = left;
		this.right = right;
	}
	
	public int getInfo() { return info; }//restituisce contenuto informativo del nodo
	
	public Node getLeft() { return left; }//restituisce il nodo figlio sinistro

	public Node getRight() { return right; }//restituisce il nodo figlio destro

	public void setInfo(int x) { this.info = x; }//modifica contenuto informativo del nodo

	public void setLeft(Node N) { this.left = N; }//modifica il puntatore al nodo figlio sinistro

	public void setRight(Node N) { this.right = N; }//modifica il puntatore al nodo figlio destro
	//---------------METODI DI SUPPORTO--------------------//

	/*Il metodo deve ritornare un valore intero (this= oggetto su cui si chiama metodo,o=oggetto in unput al metodo)
� negativo, se l�oggetto (this) � minore del parametro �o�
�nullo, se l�oggetto (this) � uguale al parametro �o�
� positivo, se l�oggetto(this) � maggiore al parametro �o� */
	
	//@override classe preferinita Comparable
	public int compareTo (Node n){
		// si fanno le dovute verifiche
			if(this.getInfo()<n.getInfo()){return -1;}
			if(this.getInfo() == n.getInfo()){return 0;}
			else//this.getInfo()> n.getInfo()
				return 1;
		}
	//METODO CHE CI DICE SE IL NODO SU CUI SI CHIAMA (this) � UNA FOGLIA
		public boolean isFoglia(){
			if(this.getRight()==null && this.getLeft()==null)
					return true;
			else
			       return false;
		}
		
	
}

