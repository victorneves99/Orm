package com.condominios.orm.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unidades")
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numero;
    @ManyToOne(fetch = FetchType.LAZY)
    private Condominio condominio;
    @ManyToOne(fetch = FetchType.LAZY)
    private Morador dono;

    public Unidade(Long id, Long numero, Condominio condominio, Morador dono) {
        this.id = id;
        this.numero = numero;
        this.condominio = condominio;
        this.dono = dono;
    }

    public Unidade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Morador getDono() {
        return dono;
    }

    public void setDono(Morador dono) {
        this.dono = dono;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((condominio == null) ? 0 : condominio.hashCode());
        result = prime * result + ((dono == null) ? 0 : dono.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Unidade other = (Unidade) obj;
        if (condominio == null) {
            if (other.condominio != null)
                return false;
        } else if (!condominio.equals(other.condominio))
            return false;
        if (dono == null) {
            if (other.dono != null)
                return false;
        } else if (!dono.equals(other.dono))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }

}
