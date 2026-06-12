package CaseMethod2;

public class NodePesanan04 {
    Pesanan04 pesanan;
    NodePesanan04 prev, next;

    public NodePesanan04(NodePesanan04 prev, Pesanan04 pesanan, NodePesanan04 next) {
        this.prev = prev;
        this.pesanan = pesanan;
        this.next = next;
    }
}