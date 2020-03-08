import java.util.Scanner;
/**
 * Programa para hallar el periodo de oscilacion de un pendulo
 * @autores Santiago Velasquez, Mario Dorado y Jeimmy Naranjo
 */
public class ProgramaPendulo
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        Pendulo Pen = null;
        int opciones;
           do
           { 
                  System.out.println("1.Crear Pendulo");
                  System.out.println("2. Imprimir el Pendulo");
                  System.out.println("3. Conocer el periodo de oscilacion del pendulo");
                  System.out.println("0. Salir");
                  System.out.println("opcion => ");
                  opciones = teclado.nextInt();
                  switch (opciones)
                  {
                      case 1:
                      double l=0;
                      System.out.print("Longitud de la cuerda = ");
                      l = teclado.nextDouble();
                      double g=0;
                      System.out.print("Aceleracion gravitacional = ");
                      g = teclado.nextDouble();
                      
                      Pen = new Pendulo (l,g);
                      System.out.println("Pendulo creado con exito");
                      break;
                      
                      case 2:
                      System.out.println("Longitud de  la cuerda = " + 
                                     Pen.getLongitud() + ", Aceleracion gravitacional = "+
                                     Pen.getAceleracionG());
                      break;
                      
                      case 3:
                      System.out.printf("El periodo de oscilacion del pendulo es %.2f\n",
                                            Pen.periodo());
                      break;                      
                      
                  }
           }
           while (opciones != 0);
           {
           }
    }
    
}
