package at.cff.undirectedgraph;

public class Edge {
    private String label;       //name of the Edge (human readability)
    private Vertex source;      //source Vertex
    private Vertex destination; //destination Vertex
    private int weight;         //weight (of the way)

    public Edge(String label, Vertex s, Vertex d, int weight){
        this.label = label;
        this.source = s;
        this.destination = d;
        this.weight = weight;
    }
}
