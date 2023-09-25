package med.voll.api.dominio.consulta;


import jakarta.validation.constraints.NotNull;
import med.voll.api.dominio.consulta.MotivoCancelamiento;

public record DatosCancelamientoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamiento motivo) {
}
