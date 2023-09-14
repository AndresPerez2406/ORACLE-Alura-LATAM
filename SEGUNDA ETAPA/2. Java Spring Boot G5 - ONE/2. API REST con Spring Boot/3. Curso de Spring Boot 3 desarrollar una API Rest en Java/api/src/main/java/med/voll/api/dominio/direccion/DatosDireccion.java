package med.voll.api.dominio.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccion(@NotBlank String calle, @NotBlank String ciudad, @NotBlank String numero) {
}