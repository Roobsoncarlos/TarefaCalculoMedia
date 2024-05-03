//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculoMedia {

    public static void main(String[] args) {

        calculoMedia();

    }
    public static void calculoMedia(){
        float nota1 = 5f;
        float nota2 = 8f;
        float nota3 = 4f;
        float nota4 = 9f;
        float media = (nota1 + nota2 + nota3 + nota4) / 4f;

        System.out.println("Olá caro(a) Aluno(a)");
        System.out.println("A sua média é: " + media);
    }
}