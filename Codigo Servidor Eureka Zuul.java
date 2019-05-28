
// crea el proyecto maven desde la pagina sprint inicializador
 en dependencias escoje servidor eureka(en la version 1.5)




// se crea archivo yml
server:
  port: 8763
eureka:
  client:
    registerWithEureka: false
    fetchRegistry: false

----------------------------------

// en el navegador digitamos

http://localhost:8761   

guia: https://www.youtube.com/watch?v=SjU3AsSATvI

//para validar servidor y cliente eureka
localhost:8080/get-greeting



-------- se edita el archivo yml


spring.application.name: servidor-eureka
server.port: 8070
eureka.client.serviceUrl.defaultZone: ${EUREKA_URI:http://localhost:8761/eureka}
eureka.instance.prefer-ip-address=true




spring:
  application:
    name: Eureka-Servidor
    
server:
  port: 8071
  
eureka:
  client:
    registerWithEureka: true
    fetchRegistry: true
    serviceUrl:
      defaultZone: ${EUREKA_URI:http://localhost:8070/eureka}
  instance:
    hostname: true


    //para zuul

    https://www.youtube.com/watch?v=D-kxyGc-mcs
    https://github.com/Netflix/zuul


    // para pagina navegacion

    https://startbootstrap.com/snippets/navbar-logo/


routerLink ="/RegistroautomotorComponent" routerLinkActive="active"