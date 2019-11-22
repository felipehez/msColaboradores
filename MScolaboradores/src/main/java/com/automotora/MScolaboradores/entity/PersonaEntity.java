package com.automotora.MScolaboradores.entity;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@Document(collection = "MicroAutomotora")
public class PersonaEntity implements Serializable {

    private static final long serialVersionUID = -1L;

    @Id
    @NotNull
    private String id;
    private String rut;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private LocalDate fechaNacimiento;
    private String tipo;
/*
   // public ColaboradorEntity(String rut1, String nombre1) {    }

    // private String apellido;

    // private String sexo;
    // private int sueldoBase;
    // private String fechaIncorporacion;
    //  private String nivelPermiso;
    //  private int bonoServicio;

 */
}


