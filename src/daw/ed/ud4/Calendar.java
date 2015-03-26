package daw.ed.ud4;

/**
 *
 * @author carlos
 */

public class Calendar {
    
    public static final int ENE = 0;
    public static final int FEB = 1;
    public static final int MAR = 2;
    public static final int ABR = 3;
    public static final int MAY = 4;
    public static final int JUN = 5;
    public static final int JUL = 6;
    public static final int AUG = 7;
    public static final int SEP = 8;
    public static final int OCT = 9;
    public static final int NOV = 10;
    public static final int DIC = 11;
    
    private final int dias[] = {
        31,28,31,30,31,30,31,31,30,31,30,31
    };
    
    public int numDia(int dia, int mes, int año) {
        
        int diaAño = 0;
       
        boolean esBisiesto;
        esBisiesto = ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0 );
        if (esBisiesto) dias[FEB]++;
        
        
        //Valida fecha
        if (mes < 1 || mes > 12 || dia < 1)
            throw new IllegalArgumentException("Fecha fuera de rango");
        if (mes == 2) {
            if (esBisiesto) {
                if (dia > 29) {
                    //No puede tener más de 29 días.
                    //Lanzar excepción
                } else if (dia > 28) {
                    throw new IllegalArgumentException("Fecha fuera de rango");
                }
            }
        } else {
            if (dia > dias[mes]) {
                //No puede tener más días que el mes correspondiente
                //Lanzar excepción
                throw new IllegalArgumentException("Fecha fuera de rango");
            }
        }
        
        /*
        Calculamos el día del año sumando los días de los meses
        correspondientes hasta el mes anterior.
        */
        
        diaAño = dia;
        
        for (int i = 0; i < mes; i++) {
            diaAño += dias[i];
        }
        
        
        return diaAño;
        
    }
    
}
