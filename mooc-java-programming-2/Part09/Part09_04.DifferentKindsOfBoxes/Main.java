
class Main {

    public static void main(String[] args) {
        // You can test your program here

        // Box box = new BoxWithMaxWeight(5);
        // box.add(new Item("a", 1));
        // box.add(new Item("b", 2));
        // box.add(new Item("c", 2));
        // box.add(new Item("d", 1));
        // box.add(new Item("f", 0));
        // boolean isIn = box.isInBox(new Item("c"));

        // System.out.println(isIn);

        OneItemBox box = new OneItemBox();
        box.add(new Item("a", 1));
        box.add(new Item("b", 2));
        box.add(new Item("c", 2));
        boolean isIn = box.isInBox(new Item(
            "b"));
        // expected:<false> but was:<true>
        System.out.println(isIn);

        box.printItems();

    }
}

