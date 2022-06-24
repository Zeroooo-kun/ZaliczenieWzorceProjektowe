public class User1 implements Observer{

    @Override
    public void update() {
        System.out.println("Koniec pracy!!!"+ this.getClass().getName());

    }
}
