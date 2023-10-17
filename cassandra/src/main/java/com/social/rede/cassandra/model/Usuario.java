package com.social.rede.cassandra.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table("usuarios")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {

    @PrimaryKey
    private String email;

    @Column
    private String password;

    @Column
    private List<Post> posts;

    @Column
    private List<Usuario> amigos;

}