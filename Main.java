import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do fatura");
        fatura.setDescricao(scanner.nextLine());
        System.out.println("Digite o nome do categoria");
        fatura.setDescricao(scanner.nextLine());
        System.out.println("Digite a quantidade por item");
        fatura.setQuantidadeItem(scanner.nextInt());
        System.out.println("Digite o preço por item");
        fatura.setPrecoItem(scanner.nextDouble());

        System.out.println("Valor total: ");
        System.out.println(fatura.getTotalFatura());

        System.out.println("===================================");

        Empregado empregado = new Empregado();
        System.out.println("Digite o nome do primeiro empregado");
        empregado.setNome(scanner.nextLine());
        System.out.println("Digite o sobrenome do primeiro empregado");
        empregado.setSobrenome(scanner.nextLine());
        System.out.println("Digite o salario do primeiro empregado");
        empregado.setSalariomensal(scanner.nextDouble());

        System.out.println("Digite o nome do segundo empregado");
        empregado.setNome(scanner.nextLine());

        System.out.println("Salario Anual:");
        System.out.println(empregado.getSalarioAnual());

        System.out.println("Salario com aumento:");
        System.out.println(empregado.getAumento());

        System.out.println("===================================");

        Data data = new Data(10,9,2024);
        data.getDisplayData();
    }
}

