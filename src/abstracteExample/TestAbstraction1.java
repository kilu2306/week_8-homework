package abstracteExample;

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s= new Circle1() {
            @Override
            public void drow() {

            }
        };
        s.drow();

    }
}
