public class BrownieCafe extends Brownie {
    public BrownieCafe(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public int compareTo(Brownie o) {
        return Double.compare(this.getPreco(),o.getPreco());
    }
}
