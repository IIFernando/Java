package poo.Package;

public abstract class serviceMensagemInstantanea {

    // public void enviarMensagem()
    // {
    //     validarConectadoInternet(); // Chamando o método privado. Encapsular é isso limitar o uso dentro da propria classe.
    //     System.out.println("Mensagem enviada com sucesso!");
    //     salvarHistoricoMensagem(); // Chamando o método privado. Encapsular é isso limitar o uso dentro da propria classe.
    // }

    // public void receberMensagem()
    // {
    //     System.out.println("Mensagem recebida com sucesso!");
    // }

    // // Alterando estes dois métodos com private, pois não deveriam ser instanciados fora da classe.
    // private void validarConectadoInternet()
    // {
    //     System.out.println("Validando se está conectado a internet.");
    // }

    // private void salvarHistoricoMensagem()
    // {
    //     System.out.println("Salvando histórico de mensagens.");
    // }

    public abstract void enviarMensagem(); // Método abstrato, não tem corpo, não tem implementação, a implementação é feita nas classes filhas.
    public abstract void receberMensagem();

    // Método protegido, só pode ser acessado pelas classes filhas.
    protected void validarConectadoInternet()
    {
        System.out.println("Validando se está conectado a internet.");
    }

}
