public class AgenciaZ extends AgenciaBolsa{

    private String email;

    public AgenciaZ( AgenteBolsa agente, String email ){
        this.email = email;
        this.agente = agente;
        this.agente.agregar(this);
    }

    @Override
    public void actualizar(){
        System.out.println("Notificacion a la agencia " + this.getClass() );
        System.out.println("Se envia al email: " + email  );
        System.out.println("El valor del Ibex 35 es: " + agente.getIbex35() );
        System.out.println("-------------------- " );
    }

}
