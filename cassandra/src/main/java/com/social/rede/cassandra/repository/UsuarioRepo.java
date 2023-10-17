package com.social.rede.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.social.rede.cassandra.model.Usuario;

@Repository
public interface UsuarioRepo extends CassandraRepository<Usuario, String> {
}
