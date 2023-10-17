package com.social.rede.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.social.rede.cassandra.model.Post;

@Repository
public interface PostRepo extends CassandraRepository<Post, String> {
}