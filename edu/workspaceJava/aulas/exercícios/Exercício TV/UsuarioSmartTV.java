public class UsuarioSmartTV {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual? " + smartTV.canal);
        System.out.println("Volume Atual?" + smartTV.volume);
    
        smartTV.ligar ();
        System.out.println("Novo Status -> TV Ligada");
    }
}
