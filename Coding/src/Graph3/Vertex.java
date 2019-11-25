package Graph3;

import java.util.ArrayList;

public class Vertex {
    public int value;
    public ArrayList<Vertex> adj;
    boolean visited;

    public Vertex(int value) {
        this.value = value;
        adj = new ArrayList<Vertex>();
        visited = false;
    }
}
