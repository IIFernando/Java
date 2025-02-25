package poo;

import poo.Package.Facebook;
import poo.Package.MSNMessenger;
import poo.Package.Telegram;
import poo.Package.serviceMensagemInstantanea;

public class Main {
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
