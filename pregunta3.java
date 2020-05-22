import java.util.Scaner;

class pregunta3{
static Scaner teclado=new Scaner(System.ln);

//El algoritmo permite indentificar el tipo de vacuna que se debe aplicar a una persona
public static void tipovacunaADQY(){
   String sexo, tipovacuna;
   int edad;
   //Datos de entrada
   System.out.print("Ingrese la edad de la persona:");
   edad=teclado.nextInt();
   System.out.print("Ingrese el sexo de la persona:");
   sexo=teclado.nextInt();
   //Proceso
   if(edad<16){
        tipovacuna="Aplicar vacuna tipo A";
   }else if(edad<16 && edad<=69){
        if(sexo.equals("H")){
        tipovacuna="Aplicar vacuna tipo B";
        }else{
        tipovacuna="Aplicar vacuna tipo A"; 
        }
    }else{
        tipovacuna="Aplicar vacuna tipo C";
    }   
    //datos de salida
    System.out.println(tipovacuna);


}
