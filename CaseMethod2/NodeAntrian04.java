package CaseMethod2;

public class NodeAntrian04 {
    int noAntrian;
    Pembeli04 pembeli;
    NodeAntrian04 prev, next;

    public NodeAntrian04(NodeAntrian04 prev, int noAntrian, Pembeli04 pembeli, NodeAntrian04 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.next = next;
    }
}