import java.util.ArrayList;

public class AgenteBolsa {

    private ArrayList<AgenciaBolsa> agencias;
    private double ibex35;

    public AgenteBolsa() {
        agencias = new ArrayList<>();
        ibex35 = 8000.0;
    }

    public double getIbex35() {
        return ibex35;
    }

    public void setIbex35(double ibex35){
        this.ibex35 = ibex35;
        notificarAgencias();
    }

    public void notificarAgencias(){
        for ( AgenciaBolsa agencia : agencias ){
            agencia.actualizar();
        }
    }

    public void agregar( AgenciaBolsa agencia ) {
        agencias.add(agencia);
    }

}
