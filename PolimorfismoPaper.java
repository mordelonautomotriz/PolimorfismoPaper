/*

 */
package polimorfismopaper;
class controlCamaras{
    public void anguloDireccion(){
        System.out.println("Enfocar el objeto.");
    }
}  
class camaraFrontal extends controlCamaras{
    public void anguloDireccion(){
        System.out.println("Elimina la necesidad de una luz auxiliar, "
                + "\nfacilita la obtención de imágenes "
                + "\nnítidas y con colores precisos. \n\n");
    }    
}

class camaraLateral extends controlCamaras{
    public void anguloDireccion(){
        System.out.println(" el sistema de video NTSC TV, "
                + "\nseñal CVBS y conector RCA.\n\n");
    }    
}

class camaraTrasera extends controlCamaras{
    public void anguloDireccion(){
        System.out.println("Lente conocido como “ojo de pez”. "
                + "\npermite ver objetos distantes\n\n");
    }    
}

class camaraLidar extends controlCamaras{
    public void anguloDireccion(){
        System.out.println("[LIght Detection And Ranging], utiliza ondas de radio "
                + "\nmapeando superficies y evitando obstáculos en todo momento.\n\n");
    }    
}

/**
 * @author Hector Ortiz
 */
public class PolimorfismoPaper {

    public static void main(String[] args) {

        controlCamaras deteccion1 = new camaraFrontal();
        controlCamaras deteccion2 = new camaraLateral();
        controlCamaras deteccion3 = new camaraTrasera();
        controlCamaras deteccion4 = new camaraLidar();
        
    System.out.println("\t\tUniversidad de las Fuerzas Armadas Espe - Sede Latacunga");
    System.out.println("Materia: Programacion");
    System.out.println("NRC: 7450");
    System.out.println("Docente: Ing. Luis Guerra");
    System.out.println("Nombre: Ortiz Hector\n");
        
        System.out.println("Con el control de camara definimos el angulo de direccion que tiene la camara: FRONTAL \n");
        deteccion1.anguloDireccion();
        
        System.out.println("Con el control de camara definimos el angulo de direccion que tiene la camara: LATERAL \n");
        deteccion2.anguloDireccion();
        
        System.out.println("Con el control de camara definimos el angulo de direccion que tiene la camara: TRASERA \n");
        deteccion3.anguloDireccion();
        
        System.out.println("Con el control de camara definimos el angulo de direccion que tiene la camara: LIDAR \n");
        deteccion4.anguloDireccion();
    } 
}
