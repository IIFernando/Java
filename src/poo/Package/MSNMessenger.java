package poo.Package;

// O método extends é utilizado para herdar as características de outra classe.
public class MSNMessenger extends serviceMensagemInstantanea
{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

}
