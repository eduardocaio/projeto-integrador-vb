package controlador;

import servicos.ServDados;

public class CtrAmbiente {

    public static int getLuminosidade() {
        return ServDados.getLuminosidade();
    }

    public static float getTemperatura() {
        return ServDados.getTemperatura();
    }

    public static float getUmidade() {
        return ServDados.getUmidade();
    }

    public static String verificarUmidade(){
        return ServDados.verificarUmidade();
    }

    public static String verificarTemperatura(){
        return ServDados.verificarTemperatura();
    }

    public static String verificarLuminosidade(){
        return ServDados.verificarLuminosidade();
    }
}
