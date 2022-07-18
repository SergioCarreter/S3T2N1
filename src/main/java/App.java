public class App {

    public static void main(String[] args) {

        AgenteBolsa agente = new AgenteBolsa();

        AgenciaBolsa etoro = new EToro(agente, "etoro@etoro.com");
        AgenciaBolsa agZ = new AgenciaZ(agente, "agenciaz@az.com");
        AgenciaBolsa agX = new AgenciaX(agente, "agenciax@ax.com");

        System.out.println( "El IBEX 35 actualiza su valor a 8015.5.");
        System.out.println( "----------------------");
        agente.setIbex35(8015.5);

    }

}
