package arraylist_linkedlist;

import java.util.*;

public class ProductManageLinkedList {
    static Scanner input = new Scanner(System.in);
    static LinkedList<Product> product = new LinkedList<>();
    static Comparator<Product> com = (Product o1, Product o2) -> o1.getCost() > o2.getCost()
            ? 1
            : -1;

    static Comparator<Product> comReverse = (Product o1, Product o2) -> o1.getCost() < o2.getCost()
            ? 1
            : -1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Remove product");
            System.out.println("4. Display product list");
            System.out.println("5. Search product by name");
            System.out.println("6. Sort product by increasing cost");
            System.out.println("7. Add product by decreasing cost");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    editProduct();
                    break;

                case 3:
                    removeProduct();
                    break;

                case 4:
                    displayProduct();
                    break;

                case 5:
                    searchProduct();
                    break;

                case 6:
                    sortIncreaseCost();
                    break;

                case 7:
                    sortDecreaseCost();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }

    private static void addProduct() {
        System.out.println("Enter product's name:");
        String name = input.nextLine();
        System.out.println("Enter cost:");
        double cost = input.nextDouble();

        product.add(new Product(name, cost));

        System.out.println();
    }

    private static void editProduct() {
        System.out.println("Enter the id to choose the product you want to edit:");
        int checkId = input.nextInt();
        input.nextLine();

        for (Product p : product) {
            if (p.getId() == checkId) {
                System.out.println("Enter product's name:");
                String name = input.nextLine();
                System.out.println("Enter cost:");
                double cost = input.nextDouble();

                p.setName(name);
                p.setCost(cost);

                break;
            }
        }
        System.out.println();
    }

    private static void removeProduct() {
        System.out.print("Enter the id to choose the product you want to remove:");
        int checkId = input.nextInt();
        input.nextLine();

        for (Product p : product) {
            if (p.getId() == checkId) {
                product.remove(p);
                break;
            }
        }
        System.out.println(1);
    }

    private static void displayProduct() {
        System.out.println();
        System.out.println("------------------------------");
        for (Product p : product) {
            System.out.println(p);
        }
        System.out.println("------------------------------");
        System.out.println();
    }

    private static void searchProduct() {
        System.out.println("Enter name of the product you want to search:");
        String sName = input.nextLine();

        ArrayList<Product> searchedProduct = new ArrayList<>();

        System.out.println();
        System.out.println("------------------------------");
        for (Product p : product) {
            String nameProduct = p.getName().toLowerCase();
            String strToCheck = sName.trim().toLowerCase();
            if (nameProduct.contains(strToCheck)) {
                searchedProduct.add(p);
            }
        }

        for (Product p : searchedProduct) {
            System.out.println(p);
        }
        System.out.println("------------------------------");
        System.out.println();
    }

    private static void sortIncreaseCost() {
        Collections.sort(product, com);

        System.out.println();
        System.out.println("------------------------------");
        for (Product p : product) {
            System.out.println(p);
        }
        System.out.println("------------------------------");
        System.out.println();
    }

    private static void sortDecreaseCost() {
        Collections.sort(product, comReverse);

        System.out.println();
        System.out.println("------------------------------");
        for (Product p : product) {
            System.out.println(p);
        }
        System.out.println("------------------------------");
        System.out.println();
    }
}
