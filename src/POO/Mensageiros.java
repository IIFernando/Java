package POO;

import POO.Package.Facebook;
import POO.Package.MSNMessenger;
import POO.Package.Telegram;
import POO.Package.serviceMensagemInstantanea;

public class Mensageiros {
    public static void main(String[] args) {

        // Aplicando o polimorfismo para instanciar a classe serviceMensagemInstantanea
        serviceMensagemInstantanea smi = null;
        
        // Definindo qual aplicativo de mensagem será utilizado
        String appEscolhido = "Telegram";

        // Verificando qual aplicativo de mensagem foi escolhido
        if(appEscolhido.equals("MSN")) {
            smi = new MSNMessenger();
        } else if(appEscolhido.equals("Facebook")) {
            smi = new Facebook();
        } else if(appEscolhido.equals("Telegram")) {
            smi = new Telegram();
        }

        // Enviando e recebendo mensagens
        smi.enviarMensagem();
        smi.receberMensagem();
        
    }
}
