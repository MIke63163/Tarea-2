

public class Matematico{
    public String ordenar( int x, int y, int z){
    String reporte;
    if(x > y ){
       if(x >= z){
          if(y > z){
             reporte = x + "Mayor" + "-" + y + "Medio" + "-" + z + "Menor";
            }else{
                  reporte = x + "Mayor" + "-" + z + "Medio" + "-" + y + "Menor";
                 }
          }else{
                reporte = z + "Mayor" + "-" + x + "Medio" + "-" + y + "Menor";
               }
       }else{
             if(y >= z){
                if(z > x){
                   reporte = y + "Mayor" + "-" + z + "Medio" + "-" + x + "Menor";
                }else{
                      reporte = y + "Mayor" + "-" + x + "Medio" + "-" + z + "Menor";
                     }
             }else{
                   reporte = z + "Mayor" + "-" + y + "Medio" + "-" + x + "Menor";
                }   
             }
    return reporte;    
    }
    public double calcArea(double base, double altura){
     return base * altura;
    } 
    public String cuadrante(double x, double y){
    String reporte;
    if(x == 0 && y == 0){
        reporte = "En el origen";
       }else{
             if(x > 0 && y > 0){
                reporte = "1er Cuadrante";
                }else{
                      if(x < 0 && y > 0){
                         reporte = "2do Cuadrante";
                        }else{
                              if(x < 0 && y < 0){
                                 reporte = "3er Cuadrante";
                                }else{
                                      reporte = "4to Cuadrante";
                                }
                        }
                }
        }
    return reporte;   
    }
}
