import java.util.*;

class Apparel {
    String Item_id;
    int Price;
    String Item_type;
    static int Counter = 100;

    Apparel(int p, String s) {
        this.Price = p;
        this.Item_type = s;
        switch (s) {
            case "Cotton":
                this.Item_id = "C".concat(Integer.toString(++Counter));
                break;
            case "Silk":
                this.Item_id = "S".concat(Integer.toString(++Counter));
                break;
            default:
                System.out.println("The item type is wrong. So no item id saved.");
                break;
        }
        System.out.println("The item_id is " + this.Item_id);
    }

    void calculate_price() {
        int s = this.Price;
        s += ((5 * s) / 100);
        this.Price = s;
    }

    void get_item_id() {
        System.out.println("The id of given item is " + this.Item_id);
    }

    void set_price() {
        System.out.println("The price of the apparel is " + this.Price);
    }
}

class Cotton extends Apparel {
    int discount;

    Cotton(int p, int d) {
        super(p, "Cotton");
        this.discount = d;
    }

    void calculate_price() {
        super.calculate_price();
        int s = this.Price;
        s -= this.discount;
        s += ((5 * s) / 100);
        this.Price = s;
    }

    void get_discount() {
        System.out.println("The discount on given apparel is " + this.discount);
    }
}

class Silk extends Apparel {
    int points;

    Silk(int p) {
        super(p, "Silk");
    }

    void calculate_price() {
        super.calculate_price();
        int s = this.Price;

        if (s > 10000)
            this.points = 10;
        else if (s <= 10000)
            this.points = 3;
        else
            System.out.println("Wrong value....No points saved.");

        s += ((10 * s) / 100);
        this.Price = s;
    }

    void get_points() {
        System.out.println("The discount on given apparel is " + this.points);
    }
}

public class Assignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to apparel store: ");
        ArrayList<Cotton> array1 = new ArrayList<>();
        ArrayList<Silk> array2 = new ArrayList<>();
        String yn = "Y";
        while (!"N".equals(yn)) {
            System.out.println("Please select from the options listed out:");
            System.out.println("1.Select an apparel");
            System.out.println("2.View the price of an apparel: ");
            System.out.println("3.View details of an apparel: ");
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println("Please write the type of the item:(Cotton/Silk) ");
                    String s = sc.next();
                    System.out.println("Write the price: ");
                    int p = sc.nextInt();
                    if ("Cotton".equals(s)) {
                        System.out.println("Please type the discount: ");
                        int d = sc.nextInt();
                        array1.add(new Cotton(p, d));
                    } else {
                        array2.add(new Silk(p));
                    }
                }
                case 2 -> {
                    System.out.println("Type the item id here: ");
                    String i = sc.next();
                    for (Cotton u : array1) {
                        if (u.Item_id.equals(i)) {
                            u.calculate_price();
                            u.set_price();
                        }
                        for (Silk v : array2) {
                            if (v.Item_id.equals(i)) {
                                v.calculate_price();
                                v.set_price();
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Type the item id here: ");
                    String i = sc.next();
                    for (Cotton u : array1) {
                        if (u.Item_id.equals(i)) {
                            System.out.println("The details of given item are: ");
                            u.get_item_id();
                            u.set_price();
                            System.out.println("The type of apparel is " + u.Item_type);
                            u.get_discount();
                        }
                    }
                    for (Silk v : array2) {
                        if (v.Item_id.equals(i)) {
                            System.out.println("The details of given item are: ");
                            v.get_item_id();
                            v.set_price();
                            System.out.println("The type of apparel is " + v.Item_type);
                            v.get_points();
                        }
                    }
                }
                default -> {
                    System.out.println("Wrong input....");
                }
            }
            System.out.println("To Quit type 'N'(running or else):");
            yn = sc.next();
        }
        System.out.println("Have a nice day......");
    }
}