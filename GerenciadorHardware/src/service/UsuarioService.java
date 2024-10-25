package service;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioService {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void registrarUsuario(Usuario usuario) {
        if (usuario.getEmail() != null && !usuario.getEmail().isEmpty()) {
            usuarioDAO.adicionarUsuario(usuario);
            System.out.println("Usuário registrado com sucesso.");
        } else {
            System.out.println("E-mail inválido.");
        }
    }

    public boolean autenticar(String email, String senha) {
        Usuario usuario = usuarioDAO.buscarPorEmail(email);
    return usuario != null && usuario.getSenha().equals(senha);
}
}
