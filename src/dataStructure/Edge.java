package dataStructure;
import java.io.Serializable;

public class Edge implements edge_data,Serializable{

    //Fields
    private int src;
    private int dest;
    private double weight;
    private String info;
    private int tag;

    /**
     *The default constructor
     */
    public Edge(){
        this.src=0;
        this.dest=0;
        this.weight=0.0;
        this.info="";
        this.tag=0;
    }

    /**
     *A constructor that accepts parameters
     */
    public Edge(int s, int d, double w){
        if(w<0)
        {
            throw new RuntimeException("ERR: The weight is negative");
        }
        this.src=s;
        this.dest=d;
        this.weight=w;
        this.info="";
        this.tag=0;
    }

    /**
     *Copy constructor
     */
    public Edge(Edge e){
        this.src=e.src;
        this.dest=e.dest;
        this.weight=e.weight;
        this.info=e.info;
        this.tag=e.tag;
    }

    /**
     * @return the src of the edge
     */
    @Override
    public int getSrc() {
        return this.src;
    }

    /**
     * @return the dest of the edge
     */
    @Override
    public int getDest() {
        return this.dest;
    }

    /**
     * @return the weight of the edge
     */
    @Override
    public double getWeight() {
        return this.weight;
    }

    /**
     * @return the info of the edge
     */
    @Override
    public String getInfo() {
        return this.info;
    }

    /**
     * @param s the new info
     *set s to be the new info of the edge
     */
    @Override
    public void setInfo(String s) {
        this.info=s;
    }

    /**
     * @return the tag of the edge
     */
    @Override
    public int getTag() {
        return this.tag;
    }

    /**
     * @param t - the new value of the tag
     * set t to be the new tag of the edge
     */
    @Override
    public void setTag(int t) {
        this.tag=t;
    }

    /**
     *A method that prints all the parameters of the edge
     */
    public String toString()
    {
        return "src: "+this.src+",dest: "+this.dest+",weight: "+this.weight+",info: "+this.info+",tag: "+this.tag;
    }
}
