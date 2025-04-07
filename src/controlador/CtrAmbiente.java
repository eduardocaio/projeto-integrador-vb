package controlador;

import servicos.ServDados;

public class CtrAmbiente {

    public static int getLuminosidade() {
        System.out.println(ServDados.getLuminosidade()); 
        return ServDados.getLuminosidade();
    }

    public static float getTemperatura() {
        System.out.println(ServDados.getTemperatura()); 
        return ServDados.getTemperatura();
    }

    public static float getUmidade() {
        System.out.println(ServDados.getUmidade()); 
        return ServDados.getUmidade();
    }

    public static String verificarUmidade(){
        System.out.println(ServDados.verificarUmidade()); 
        return ServDados.verificarUmidade();
    }

    public static String verificarTemperatura(){
        System.out.println(ServDados.verificarTemperatura()); 
        return ServDados.verificarTemperatura();
    }

    public static String verificarLuminosidade(){
        System.out.println(ServDados.verificarLuminosidade()); 
        return ServDados.verificarLuminosidade();
    }

    public static void retornarTodosDadosTeste(){
        getLuminosidade();
        getTemperatura();
        getUmidade();
        verificarLuminosidade();
        verificarTemperatura();
        verificarUmidade();
    }
}
