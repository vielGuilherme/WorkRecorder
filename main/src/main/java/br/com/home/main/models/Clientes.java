package br.com.home.main.models;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Clientes {

    @Column
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
