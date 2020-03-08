
/**
 * La clase pendulo tiene como atributos: Longitud de la cuerda y 
 * aceleracion gravitacional
 * - Operaciones: Periodo de oscilancion del pandulo
 */
public class Pendulo
{
    //Atributos
    private double longitud, aceleracionG;
    
    //Metodo constructor
    public Pendulo(double l, double g)
    {
        this.longitud = l;
        this.aceleracionG = g;
    }
    
    //Metodos analizadores
    public double getLongitud() //Obtener la longitud de la cuerda
    {
        return this.longitud;   
    }
    
    public double getAceleracionG() //Obtener la aceleracion gravitacional
    {
        return this.aceleracionG;   
    }
    
    //Metodo modificador
    public void setLongitud(double nuevaLongitud)
    {
        this.longitud = nuevaLongitud;
    }
    
    public void setAceleracionG(double nuevaAceleracionG)
    {
        this.aceleracionG = nuevaAceleracionG;
    }
    
    //Periodo de oscilacion
    public double periodo()
    {
         double p = (2 * Math.PI) * (Math.sqrt(aceleracionG / longitud)); 
         return p;
    }
}
