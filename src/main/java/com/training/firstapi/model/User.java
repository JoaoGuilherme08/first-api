package com.training.firstapi.model;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "usuario")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long idUsuario;
    @Column(name = "nameUser")
    private String name;
    @Column(name = "yearsUser")
    private Long idade;

}
