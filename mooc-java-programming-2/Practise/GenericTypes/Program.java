
class Program {
    public static  void main(String args[]) {
        Locker<String> name = new Locker<>();

        name.setValue("James");

        System.out.println("User name: " + name.getValue());
    }
}
