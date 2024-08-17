package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {

    @Override
    public String toString() {
        return "\nDados de Cadastro Médico: " +
                "\nNome: " + nome +
                "\nEmail: " + email +
                "\nCRM: " + crm +
                "\nEspecialidade: " + especialidade +
                "\nEndereco: " + endereco;
    }
}
