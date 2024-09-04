package Mensagem.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //Somente os filhos conhecem esse metodo
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado à Internet");
    }
}
