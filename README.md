# TALLER DE ARQUITECTURAS DE SERVIDORES DE APLICACIONES, META PROTOCOLOS DE OBJETOS, PATRÓN IOC, REFLEXIÓN
Taller AREP 2021-2 / 14 Septiembre del 2021

Para este taller se debe construir un servidor Web (tipo Apache) en Java.El servidor debe ser capaz de entregar páginas html e imágenes tipo PNG. 
Igualmente el servidor debe proveer un framework IoC para la construcción de aplicaciones web a partir de POJOS. Usando el servidor se debe construir una aplicación
Web de ejemplo y desplegarlo en Heroku. El servidor debe atender múltiples solicitudes no concurrentes.Se debe desarrolar un prototipo mínimo que demuestre 
capacidades reflexivas de JAVA y permita por lo menos cargar un bean (POJO) y derivar una aplicación Web a partir de él.

# Prerrequisitos 
  + Git version 2.25.1
  + Apavhe Maven version 4.0.0
  + Java version 11.0.11
  
 Para verificar que esten instalados los programas puede usar los suguientes comandos
    + mvn --version
    + git version
    +java --version
    
    
   Para ejecutar el ejecicio utilice los siguiente comandos:
   
   Git clone ............
   
   java -cp TallerIOCyServidorWeb-1.0-SNAPSHOT.jar  co.escuelaing.arep.TallerIOCyServidorWeb.WebAppExample.WebAppStart
   co.escuelaing.arep.TallerIOCyServidorWeb.WebAppExample.MathServices
    
    
   
   
    # Licencia

  Para consultar la Licencia del proyecto haga [click aqui]()
  
  
# Autor 
  **Maria Camila Fetecua Garcia** 
