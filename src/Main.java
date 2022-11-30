public class Main {
    public static void main(String[] args) {
        //klass load olann zaman yaranan objectinn referannsini burda object deyisenine otururuk.
        SingletonObject object = SingletonObject.getInstance();

        object.test();
    }
}