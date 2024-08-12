//import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Chamar a classe usada para obter entrada do usuario
        Scanner scan = new Scanner (System.in);
        System.out.print("Digite o primeiro numero: ");
        //Utilizar um objeto da classe Scanner para obter o valor do usuario em Double
        double primeiro = scan.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double segundo = scan.nextDouble();
        //Variavel que captura a soma dos numeros passados pelo usuario
        double resultadoSoma = primeiro + segundo;
        //Retorna o resultado
        System.out.print("O resultado e: " + resultadoSoma);
    }
}