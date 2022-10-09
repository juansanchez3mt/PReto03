package com.example.reto3.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Producto")
public class Producto implements Serializable{

    @Id
    @GeneratedValue(strategy = GnerationType.IDENTITY)




}
