public class Proxy implements Service1{
    Service1 service1 ;

    @Override
    public  void method(){
        System.out.println("Welcome in our website www.happyday.com !!! We are happy to see you there ^^, We are a newly opened store where you can find everything what you need to be HAPPY.");
        if(service1== null)
            service1= new ServiceImpl();
        service1.method();
        System.out.println("After"); // możliwość wykonania kodu przed i po wykonaniu metody
    }
}
//AOP, testy, security
// Programowanie zorientowane aspektowo to nic innego jak implementacja wzorca proxy, właśnie dlatego, że mamy naszą metodę biznesową znajdującą sie w ServiceImpl
//Dodatkowo możemy wzbogcić naszą metodę poprzez wykorzystanie AOP,dodanie fragmentu przed i po
//testy