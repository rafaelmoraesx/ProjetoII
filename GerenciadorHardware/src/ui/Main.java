package ui;

import model.Usuario;
import service.UsuarioService;

import java.util.Scanner;

public class Main {
    private static UsuarioService usuarioService = new UsuarioService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Gerenciador de Hardware ===");
        System.out.println("1. Registrar Usuário");
        System.out.println("2. Sair");
        
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Nome:");
                String nome = scanner.next();
                
                System.out.println("Email:");
                String email = scanner.next();
                
                System.out.println("Senha:");
                String senha = scanner.next();
                
                System.out.println("Tipo (administrador/tecnico):");
                String tipo = scanner.next();
                
                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setSenha(senha);
                usuario.setTipo(tipo);

                usuarioService.registrarUsuario(usuario);
                break;
                
            case 2:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
