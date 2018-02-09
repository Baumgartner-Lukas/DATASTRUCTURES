package at.cff.undirectedgraph;

public class Vertex {
    private String label;   //for human readability
    private int cost;       //lowest "cost" (shortest way,...) to get from a predecessing vertex to this one

    public Vertex(String label){
        this.label = label;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
