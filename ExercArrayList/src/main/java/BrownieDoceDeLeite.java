public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public int compareTo(Brownie o) {
        return Double.compare(this.getPreco(),o.getPreco());
    }
}
