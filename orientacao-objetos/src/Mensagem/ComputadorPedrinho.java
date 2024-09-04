package Mensagem;

import Mensagem.apps.FacebookMessenger;
import Mensagem.apps.MSNMessenger;
import Mensagem.apps.ServicoMensagemInstantanea;
import Mensagem.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
            Não se sabe qual app
            Mas qualquer um deverá enviar e receber mensagens
         */

        String appEscolhido = "tlg";

        if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        } else if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fcb")) {
            smi = new FacebookMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();


    }
}
