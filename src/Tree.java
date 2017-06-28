
public class Tree {
	private int n;
	Integer[] tree = new Integer[n];
	private int greatest = tree[0];
	
	public void trees(){
		for(int i = 1; i <= n; i++){
			if(tree[i] > greatest){
				greatest += tree[i];
			}
		}
	}
	
	public void output(){
		for(int i = 0; i <= n; i++){
			if(tree[i] == greatest){
				System.out.println(tree[i]);
			}
		}
	}
	
}
