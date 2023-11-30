package org.example.AdminUcare.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.ReadOnly;
import org.openxava.annotations.Required;
import org.openxava.calculators.CurrentDateCalculator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class EstadoDeAnimo {
    @Id
    @Hidden
    String id;
    public enum ESTADO{Feliz,Bien,Cansado,Estresado,Triste};
    @Required
    private ESTADO estado;
    @Column(length = 240)
    private String comentario;
    @DefaultValueCalculator(CurrentDateCalculator.class)
    @ReadOnly
    private Date fecha;
    @ManyToOne
    @Required
    private Estudiantes estudiantes;
}
