package com.social.rede.cassandra.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.rede.cassandra.model.Post;
import com.social.rede.cassandra.repository.PostRepo;

@Service
public class PostService {
    
     @Autowired
    private PostRepo postRepo;

    public void criarPost(Post post) {
        List<String> repostas = new ArrayList<>();
        post.setRespostas(repostas);
        postRepo.save(post);
    }

    public void comentar(String comentario, String idPost) {
        Post post = postRepo.findById(idPost).orElse(null);
        if (post != null) {
            post.getRespostas().add(comentario);
            postRepo.save(post);
        }
    }

    public Post buscarPost(String idPost) {
        return postRepo.findById(idPost).orElse(null);
    }

    public List<Post> listarPosts() {
        return postRepo.findAll();
    }

    public Boolean deletarPost(String idPost) {
        if (postRepo.existsById(idPost)) {
            postRepo.deleteById(idPost);
            return true;
        }
        return false;
    }
    
}
