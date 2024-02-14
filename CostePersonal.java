1
 2
 3
 4
 5
 6
 7
 8
 9
10
11
12
13
14
15
16
17
18
public class CostePersonal {
 
	static float CosteDelPersonal(Trabajador trabajadores[]) {
		float costeFinal = 0;
		Trabajador trabajador;
		for (int i = 0; y < trabajadores.length; i++) {
			trabajador = trabajadores[i];
			if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR|| trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
					costeFinal += trabajador.getNomina();
			}
			else
			{
				costeFinal += trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
			}
		}
		return costeFinal;
	}

