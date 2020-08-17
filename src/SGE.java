import java.util.Scanner;
import java.util.Random;
import java.util.regex.Matcher;



public class SGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um login: primeira letra do nome + _ + último sobrenome.");
        String login = scanner.nextLine();


            if (login.charAt(1) == '_'){}
            if (login.length()>2){
                System.out.println("Login válido");
            }
            else {
                System.out.println("login inválido");
            }


// senha

      System.out.println("Digite uam senha: ");

        String senha = scanner.nextLine();
         final String[] caracteres = {"\\","^","$","{","}","[","]","(",")",".","*","+","?","|","<",">","-","&","%"};

       if (senha.length() >= 8) {}
       else{
               System.out.println("Senha possui menos de 8 caracteres");
           }
           if (senha.toLowerCase() == senha) {
               System.out.println("não tem maiúsculas");
           }
           if (senha.toUpperCase() == senha) {
               System.out.println("não tem minusculas");
           }
        for (int i=0;i<senha.length();i++)
            if (senha.equals(caracteres[i])){
                System.out.println("Não possui caracter");
            }
        else {
                System.out.println("Senha válida");}







    }}

