package br.com.fiap.gshealthsync.service;

import br.com.fiap.gshealthsync.model.UsuarioModel;
import br.com.fiap.gshealthsync.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public UsuarioModel save(UsuarioModel usuarioModel) {
        try {
            return usuarioRepository.save(usuarioModel);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Erro ao salvar usuário: E-mail já cadastrado.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar usuário.", e);
        }
    }

    public List<UsuarioModel> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> findById(long id) {
        return usuarioRepository.findById(id);
    }

    @Transactional
    public void delete(UsuarioModel usuarioModel) {
        try {
            usuarioRepository.delete(usuarioModel);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir usuário.", e);
        }
    }
}
