package com.marlonaguirre.almacen.core.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tipo_empaque")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoEmpaque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_empaque")
    private Long codigoEmpaque;

    @NotEmpty(message = "Debe definir una descripcion")
    @Column(name = "descripcion")
    private  String descripcion;

    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonIgnore
    @OneToMany(mappedBy = "tipoEmpaque", fetch = FetchType.LAZY)
    private List<Producto> productos;
}