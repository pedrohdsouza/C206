import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Brownie> brownies = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome de 6 Brownies");


        String nomeBrownie;
        for (int i = 0; i < 6; i++) {
            nomeBrownie = sc.nextLine();
            nomes.add(i,nomeBrownie);
        }

        Brownie brownieCafe1 = new BrownieCafe(nomes.get(0),new Random().nextDouble()*10);
        Brownie brownieCafe2 = new BrownieCafe(nomes.get(1),new Random().nextDouble()*10);
        Brownie brownieDoceDeLeite1 = new BrownieCafe(nomes.get(2),new Random().nextDouble()*10);
        Brownie brownieDoceDeLeite2 = new BrownieCafe(nomes.get(3),new Random().nextDouble()*10);
        Brownie brownieNutella1 = new BrownieCafe(nomes.get(4),new Random().nextDouble()*10);
        Brownie brownieNutella2 = new BrownieCafe(nomes.get(5),new Random().nextDouble()*10);

        brownies.add(brownieCafe1);
        brownies.add(brownieCafe2);
        brownies.add(brownieDoceDeLeite1);
        brownies.add(brownieDoceDeLeite2);
        brownies.add(brownieNutella1);
        brownies.add(brownieNutella2);

        System.out.println("------------------");
        System.out.println("Antes da ordenação: ");
        for (Brownie brownie : brownies) {
            System.out.println("Nome brownie: " + brownie.getNome());
            System.out.println("Preço brownie: R$" + brownie.getPreco());
        }
        System.out.println("------------------");

        Collections.sort(brownies);
        Collections.reverse(brownies);

        System.out.println("Depois da ordenação: ");
        for (Brownie brownie : brownies) {
            System.out.println("Nome brownie: " + brownie.getNome());
            System.out.println("Preço brownie: R$" + brownie.getPreco());
        }
    }
}
