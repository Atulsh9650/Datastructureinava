package graph;
import java.util.Scanner;
public class DFSimplementationgraph {
public static void printhelper(int[][] graph,int sv,boolean arr[] ) {
	System.out.println(sv);
	arr[sv]=true;
	for(int i=0;i<graph.length;i++) {
		if(graph[sv][i]==1 && !arr[i]) {
			printhelper(graph,i,arr);
		}
	}
	
}
	public static void print(int[][] graph) {
		boolean visited[]=new boolean[graph.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				printhelper(graph,i,visited);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int graph[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=s.nextInt();
			int sv=s.nextInt();
			graph[fv][sv]=1;
			graph[sv][fv]=1;
		}
   print(graph);
	}

}
