package com.social.rede.cassandra.Config;

import java.net.InetSocketAddress;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

import com.datastax.oss.driver.api.core.CqlSession;


@Configuration
@PropertySource(value = { "classpath:application.yml" })
@ConfigurationProperties("spring.data.cassandra")
public class CassandraConfig extends AbstractCassandraConfiguration {
    
    @Bean
    @Primary
    public CqlSession cqlSession() {
        return CqlSession.builder()
                .addContactPoint(new InetSocketAddress("127.0.0.1", 9042))
                .withLocalDatacenter("datacenter1")
                .build();
    }

    @Override
    protected String getKeyspaceName() {
        return "zuckenberg";
    }

}
