package org.example.AdminUcare.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;


import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.AssertTrue;
import java.time.LocalDate;

@Getter
@Setter
@Entity

public class Actividades{
    @Id @Hidden
    String id;
    @Column(length = 50) @Required
    private String nombreDeActividad;
    @Required
    private LocalDate fecha;
    private boolean realizado;
    @ManyToOne
    private Estudiantes estudiantes;


}