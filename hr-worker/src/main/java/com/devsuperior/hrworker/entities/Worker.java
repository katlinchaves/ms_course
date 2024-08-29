package com.devsuperior.hrworker.entities;

import java.io.Serializable;

import jakarta.persistence.*;

// entidade monitorada pelo JPA
@Entity
// cria tabela no banco de dados relacional
@Table(name = "tb_worker")
// serializable = para que a classe possa ser transformada em bytes
public class Worker implements Serializable {

    private static final long serialVersionUID = 1L;

    // chave primaria da entidade
    @Id
    // para gerar o id automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "daily_Income")
    private Double dailyIncome;

    // construtor vazio padrão do java
    public Worker() {
    }

    // construtor com os objetos instanciados
    public Worker(Long id, String name, Double dailyIncome) {
        super();
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    // getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Worker other = (Worker) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
