package POO.Package;

// O método extends é utilizado para herdar as características de outra classe.
public class Telegram extends serviceMensagemInstantanea 
{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

}
