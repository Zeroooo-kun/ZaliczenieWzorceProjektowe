public class Proxy implements Service1 {
    Service1 service1;

    @Override
    public void method() {
        System.out.println("Welcome in our website www.HappyDay.com !!! We are happy to see you there ^^, We are a newly opened store where you can find every fruit which you need to be HAPPY.");
        if (service1 == null)
            service1 = new ServiceImpl();
        service1.method();
        System.out.println("Feel free to add as many goods as you want.");
    }
}

// wykorzystanie w: AOP, testy, security
//Możemy wzbogcić naszą metodę poprzez dodanie kodu przed i po
