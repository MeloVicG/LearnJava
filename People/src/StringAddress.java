public class StringAddress {
    public static void main(String[] args) {
        String fruit = "apple"; // gives it some memory to store this string, fruit
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println(fruit == anotherFruit); // is pointing at the same address? true
        System.out.println(vegetable == anotherVegetable); // is pointing at the same address? false
    }
    // - for the fruit
    //   looks where in memory address (operating system) where it allocated the apple string
    // - so instead of making another "apple" string, it will use the same address with apple
    //   that already existed in memory.
    // - so it fruit and anotherFruit will get the same "apple in memory"

    // - for the vegetable
    //   because of the -new- its going to create more space in memory, with a new address, with the same string

    // Java has a EqualsOperator
    //
}
