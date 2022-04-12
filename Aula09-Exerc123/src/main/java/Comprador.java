public class Comprador {

    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie) {
        System.out.println(this.nome + " está comprando brownie: " + brownie.nome);
        System.out.println("Saldo: " + this.saldo);
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("Saldo após compra:  R$" + (this.saldo - brownie.preco));
    }
}
