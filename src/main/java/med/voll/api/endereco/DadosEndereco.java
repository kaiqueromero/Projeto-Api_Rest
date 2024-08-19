package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(

        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,

        @NotBlank
        String cidade,

        @NotBlank
        String uf,

        String numero,
        String complemento) {

    @Override
    public String toString() {
        return "Logradouro: " + logradouro +
                ", Bairro: " + bairro +
                ", Cep: " + cep +
                ", Cidade: " + cidade +
                ", Estado:" + uf +
                ", Número: " + numero +
                ", Complemento: " + complemento;
    }
}
