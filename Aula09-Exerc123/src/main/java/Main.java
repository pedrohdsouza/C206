public class Main {
    public static void main(String[] args) {
        Brownie brownieNutella = new BrownieNutella("Docin", 5.0,"Nutella");
        Brownie brownieDoceDeLeite = new BrownieDoceDeLeite("Doce", 4.0,"Doce de Leite");
        Brownie brownieCafe = new BrownieCafe("Doção", 1.0,"Café");

        Brownie[] brownies = new Brownie[3];

        Comprador comprador = new Comprador("Chiquinho", 100);

        brownies[0] = brownieNutella;
        brownies[1] = brownieDoceDeLeite;
        brownies[2] = brownieCafe;

        for (int i = 0; i < brownies.length; i++) {
            if(brownies[i] != null) {
                if(brownies[i] instanceof BrownieNutella) {
                    BrownieNutella brownie1 = (BrownieNutella)brownies[i];
                    brownie1.mostraInfo();
                    brownie1.adicionaNutella();
                    brownie1.addCarrinhoDeCompras();
                    brownie1.calculaValorTotalCompra();
                    System.out.println("");
                }
                else if(brownies[i] instanceof BrownieDoceDeLeite) {
                    BrownieDoceDeLeite brownie2 = (BrownieDoceDeLeite)brownies[i];
                    brownie2.mostraInfo();
                    brownie2.adicionaDoceDeLeite();
                    brownie2.addCarrinhoDeCompras();
                    brownie2.calculaValorTotalCompra();
                    System.out.println("");
                }
                else if(brownies[i] instanceof BrownieCafe) {
                    BrownieCafe brownie3 = (BrownieCafe)brownies[i];
                    brownie3.mostraInfo();
                    brownie3.adicionaCafe();
                    brownie3.addCarrinhoDeCompras();
                    brownie3.calculaValorTotalCompra();
                    System.out.println("");
                }
            }
        }

        comprador.efetuarCompra(brownieDoceDeLeite);
    }
}
