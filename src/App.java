import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.fazecast.jSerialComm.SerialPort;

import servicos.ServDados;

public class App {
   
    private static SerialPort serialPort = SerialPort.getCommPort("COM3"); //Porta em que o Arduino está conectado a máquina

    public static void main(String[] args) throws Exception {

        if (serialPort.openPort()) {
            System.out.println("Conectado ao Arduino!");
            serialPort.setBaudRate(9600);

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));

                while (true) 
                    receberDados(reader.readLine());
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Falha ao conectar ao Arduino!");
        }
    }

    private static void receberDados(String linha){
        if (linha != null) {
            System.out.println("Dados recebidos: " + linha);
            
            String[] data = linha.split(", ");
            if (data.length == 3) {
                int luminosidade = 0;
                float temperatura = 0;
                float umidade = 0;
                try {
                    luminosidade = Integer.parseInt(data[0].trim());
                    temperatura = Float.parseFloat(data[1].trim());
                    umidade = Float.parseFloat(data[2].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Erro ao processar os dados. Verifique a formatação.");
                }

                ServDados.setLuminosidade(luminosidade);
                ServDados.setTemperatura(temperatura);
                ServDados.setUmidade(umidade);
            }
        }
    }
}
