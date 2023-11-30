package org.example.AdminUcare.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;
import org.openxava.annotations.Stereotype;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class Recordatorios {
    @Id
    @Hidden
    String id;

    // Atributo de fecha y hora con anotación de OpenXava para definir un campo obligatorio
    @Required
    @Stereotype("DATETIME_SQL")
    private Timestamp fechaHora;

    // Atributo booleano que indica si el recordatorio ha sido realizado
    private boolean realizado;

    // Relación Many-to-One con la entidad Actividades
    @ManyToOne
    // Anotación de OpenXava para especificar que este campo es obligatorio
    @Required
    private Actividades actividad;

    // Relacion many to one para estudiantes
    @ManyToOne
    @Required
    private Estudiantes estudiantes;
}
