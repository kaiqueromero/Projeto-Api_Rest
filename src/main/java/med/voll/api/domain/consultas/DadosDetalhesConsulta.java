package med.voll.api.domain.consultas;

import java.time.LocalDateTime;

public record DadosDetalhesConsulta(
        Long id,
        Long idMedico,
        Long idPaciente,
        LocalDateTime data
) {
}
