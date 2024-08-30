public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal);
    }

    public void aumentarCanal(){
        this.canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal(){
        this.canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    public void ligar(){
        ligada = true;
        System.out.println("TV foi ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("TV foi desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }


}
