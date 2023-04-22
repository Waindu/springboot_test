package org.mycompany.springboot.app.models;

import javax.persistence.*;

@Entity // indicamos que será una entidad
@Table(name="bancos") // mapeamos la entidad contra una tabla en BD
public class Banco {
    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estrategia de secuencia para generación de ID en BD
    private Long id;

    private String nombre;

    @Column(name="total_transferencias") // mapeamos el atributo con una columna en la BD
    private int totalTransferencias;

    public Banco() {
    }

    public Banco(Long id, String nombre, int totalTransferencias) {
        this.id = id;
        this.nombre = nombre;
        this.totalTransferencias = totalTransferencias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalTransferencias() {
        return totalTransferencias;
    }

    public void setTotalTransferencias(int totalTransferencias) {
        this.totalTransferencias = totalTransferencias;
    }
}
