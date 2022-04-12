public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando doce de leite ao brownie!");
        System.out.println("");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de doce de leite adicionado ao carrinho");
        System.out.println("");
    }
}
