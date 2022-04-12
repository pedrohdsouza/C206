public abstract class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {
        System.out.println("Brownie adicionado ao carrinho");
        System.out.println("");
    }

    public double calculaValorTotalCompra() {
        System.out.println("Calculando valor da compra:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço R$" + this.preco);
        System.out.println("");
        return this.preco;
    }

    public void mostraInfo() {
        System.out.println("*** INFO BROWNIE ***");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço R$" + this.preco);
        System.out.println("Sabor: " + this.sabor);
        System.out.println("");
    }
}
