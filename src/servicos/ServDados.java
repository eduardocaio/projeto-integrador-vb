package servicos;

public class ServDados {

    private static int luminosidade;
    private static float temperatura;
    private static float umidade;

    public static int getLuminosidade() {
        return luminosidade;
    }

    public static void setDados(int luminosidade, float umidade, float temperatura) {
        ServDados.temperatura = temperatura;
        ServDados.umidade = umidade;
        ServDados.luminosidade = luminosidade;
    }

    public static float getTemperatura() {
        return temperatura;
    }

    public static float getUmidade() {
        return umidade;
    }

    public static String verificarUmidade(){
        if(umidade < 30)
            return "Aviso: Umidade está muito baixa!";

        if(umidade > 70)
            return "Aviso: Umidade está muito alta!";

        return "";
    }

    public static String verificarTemperatura(){
        if(umidade < 18)
            return "Aviso: Temperatura muito baixa! O ambiente pode estar frio.";

        if(umidade > 30)
            return "Aviso: Temperatura muito alta! O ambiente pode estar muito quente.";

        return "";
    }

    public static String verificarLuminosidade(){
        if(umidade < 200)
            return "Aviso: Luminosidade muito baixa! O ambiente pode estar escuro.";

        if(umidade > 800)
            return "Aviso: Luminosidade muito alta! O ambiente pode estar muito claro.";

        return "";
    }
}
