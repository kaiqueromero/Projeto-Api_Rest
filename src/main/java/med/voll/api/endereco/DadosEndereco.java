package med.voll.api.endereco;

public record DadosEndereco(String logradouro, String bairro, String cep, String cidade, String uf, String numero, String complemento) {

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
