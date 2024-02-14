public class CostePersonal {
 
    static float calcularCostePersonal(Trabajador trabajadores[]) {
        float costeFinal = 0;
        Trabajador currentWorker;
        for (int i = 0; i < trabajadores.length; i++) {
            currentWorker = trabajadores[i];
            if (currentWorker.getTipoTrabajador() == Trabajador.DIRECTOR || currentWorker.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
                costeFinal += currentWorker.getNomina();
            } else {
                costeFinal += currentWorker.getNomina() + (currentWorker.getHorasExtras() * 20);
            }
        }
        return costeFinal;
    }
}

