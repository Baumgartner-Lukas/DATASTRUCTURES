package at.cff.undirectedgraph;

import java.util.ArrayList;

public class UndirectedGraph {
    protected ArrayList<Vertex> vertices;
    protected ArrayList<Edge> edges;

    public UndirectedGraph(){
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }


}
