package dao;

import model.Usuario;
import java.sql.*;

public class UsuarioDAO {

    public void adicionarUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuario (nome, email, senha, tipo) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getTipo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Outros métodos para atualizar, deletar e buscar usuários

    public Usuario buscarPorEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
