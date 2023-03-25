public class Main {
    public static void main(String[] args) {
        GroceryList list= new GroceryList();
        GroceryItemOrder order= new GroceryItemOrder("Pepsi",2,10);
        for (int i = 0; i < 20; i++) {

            list.add(order);//will work the first 10 times only
            System.out.println(order);
        }

        System.out.println(list.getTotalCost());
        System.out.println(order.getCost());

    }
}