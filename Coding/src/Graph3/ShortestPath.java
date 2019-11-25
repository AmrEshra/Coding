package Graph3;

import java.util.Queue;
import java.awt.print.Printable;
import java.util.Iterator;
import java.util.LinkedList;

public class ShortestPath {

	public static void main(String[] args) {

		normalGraph();
	}

	public static void normalGraph() {

		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v5 = new Vertex(5);
		Vertex v7 = new Vertex(7);
		Vertex v9 = new Vertex(9);
		Vertex v10 = new Vertex(10);

		v1.adj.add(v5);
		v5.adj.add(v1);

		v2.adj.add(v7);
		v7.adj.add(v2);

		v1.adj.add(v7);
		v7.adj.add(v1);

		v1.adj.add(v10);
		v10.adj.add(v1);

		v5.adj.add(v9);
		v9.adj.add(v5);

		v9.adj.add(v10);
		v10.adj.add(v9);

		Graph g = new Graph();
		g.add(v1);
		g.add(v2);
		g.add(v5);
		g.add(v7);
		g.add(v9);
		g.add(v10);
		
		shortestPath(g, v1, v9);
	}

	public static boolean shortestPath(Graph g, Vertex start, Vertex end) {

		Queue<Vertex> q = new LinkedList<Vertex>();
		start.visited = true;
		q.add(start);

		while (!q.isEmpty()) {
			Vertex u = q.remove();
			if (u == end)
				return true;

			for (Vertex v : u.adj) {
				if (!v.visited) {
					v.visited = true;
					q.add(v);
//					print(q);
				}
			}
		}

		return false;
	}
	
	public static void print(Queue<Vertex> q){
		
		Iterator<Vertex> iter = q.iterator();
		Iterator<Vertex> current;
		while (iter.hasNext()) {
		    current = (Iterator<Vertex>) iter.next();
		    System.out.println();
		}
		
	}

}
