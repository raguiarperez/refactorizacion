package boletin4_4;

/**
 *
 * @author rafa
 */
public class Restaurante {

    private float patatiñas;
    private float pulpiño;

    public Restaurante() {
        patatiñas = 0f;
        pulpiño = 0f;
    }

    public Restaurante(float pata, float pulp) {
        patatiñas = pata;
        pulpiño = pulp;
    }

    public float getPatatiñas() {
        return patatiñas;
    }

    public void setPatatiñas(float set) {
        patatiñas = set;
    }

    public float getPulpiño() {
        return pulpiño;
    }

    public void setPulpiño(float set) {
        pulpiño = set;
    }

    public int calcCapacidad() {
        int cap1 = (int) (pulpiño / 2 * 3);
        int cap2 = (int) (patatiñas * 3);
        if (cap1 > cap2) {
            return cap2;
        } else {
            return cap1;
        }
    }
}
