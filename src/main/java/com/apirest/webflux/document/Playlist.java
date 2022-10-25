package com.apirest.webflux.document;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Playlist {
    

    @id
    private String id;
    private String nome;
    
    
        public Playlist(String id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

        /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
