package br.com.bandtec.lista.nivelamento2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu usuário: ");
        String usuario = leitor.next();
        
        System.out.println("Digite sua senha: ");
        String senha = leitor.next();
        
        String senhaCorreta = "#Bandtec";
        String usuarioCorreto = "admin";
        
        while (!senha.equals(senhaCorreta) || !usuario.equals(usuarioCorreto)) {
            System.out.println("Login e/ou senha inválidos\n");
            
            System.out.println("Digite seu usuário: ");
            usuario = leitor.next();
            
            System.out.println("Digite sua senha: ");
            senha = leitor.next();
        }
        
        System.out.println("Login realizado com sucesso");
    }
}
