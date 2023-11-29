package org.example.AdminUcare.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter

public class Estudiantes {
    @Id @Required
    @Digits(integer = 8, fraction = 0, message = "El CIF debe ser un número sin decimales")
    @Size(min = 8, max = 8, message = "El CIF debe tener exactamente 8 dígitos")
    private String cif;
    @Required
    private String nombre;
    @Required
    private String apellido;
    @Required
    private String correo;
    @Required
    private String contrasenia;

    @Hidden
    @AssertTrue(message = "El campo debe tener más de 3 caracteres")
    public boolean isnombrevalido() {
        return nombre != null && nombre.length() > 2;
    }

    @Hidden
    @AssertTrue(message = "El campo debe tener más de 3 caracteres")
    public boolean isapellidovalido() {
        return apellido != null && apellido.length() > 2;
    }

}


