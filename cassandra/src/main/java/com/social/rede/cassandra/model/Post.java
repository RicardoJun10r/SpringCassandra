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
@Table("posts")
@NoArgsConstructor
@AllArgsConstructor
public class Post implements Serializable {

    @PrimaryKey
    private String id;

    @Column
    private String mensagem;

    @Column
    private List<String> respostas;

    @Column("eh_privado")
    private Boolean ehPrivado;

}