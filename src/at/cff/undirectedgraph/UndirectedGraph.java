package at.cff.undirectedgraph;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph {
    private List<Vertex> vertices = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();

    public UndirectedGraph(ArrayList vertices, ArrayList edges){
        this.edges = edges;
        this.vertices = vertices;
    }
}
