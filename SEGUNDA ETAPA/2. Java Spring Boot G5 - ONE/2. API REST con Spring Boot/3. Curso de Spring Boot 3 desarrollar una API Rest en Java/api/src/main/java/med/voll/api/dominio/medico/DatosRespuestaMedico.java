package med.voll.api.dominio.medico;

import med.voll.api.dominio.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String telefono, String documento,
    DatosDireccion direccion) {
}