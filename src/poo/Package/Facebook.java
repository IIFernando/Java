package poo.Package;

// O método extends é utilizado para herdar as características de outra classe.
public class Facebook extends serviceMensagemInstantanea 
{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

}
