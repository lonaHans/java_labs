package org.example;

public class CampusStoreMain {
    static void main() {
        CampusStore cs1 = new CampusStore(0,"IceCream","011",10,11);
        CampusStore cs2 = new CampusStore(1,"Cream","012",30,4);
        CampusStore cs3 = new CampusStore(8,"Cookies","013",1,7);
        CampusStore cs4 = new CampusStore(2,"Cookies&cream","014",15,11);
        CampusStore cs5 = new CampusStore(11,"Chocolate Chips","011",13,0);

        CampusStore[] cart = {cs1,cs2,cs3,cs4,cs5};

        double subTotal =0;
        double total=0;
        double discount =0;

        String searchedProduct = "flower";
        boolean isAvailable = false;

        for(int i =0; i < cart.length; i++){
            if(cart[i].matchesName(searchedProduct)){
                System.out.println("Product is avaible!!");

                isAvailable = true;
                break;
            }

        }
        if(!isAvailable){
            System.out.println("Product is not avaible");
        }

        cs5.addStock(3);
        cs3.addStock(11);

        System.out.println("----Receipt-----");

        for(int i =0; i < cart.length; i++){

            if(cart[i].isQuantityAvailable()){
                if(cart[i].processSale()){
                    double lineTotal = cart[i].totalAmount();

                    cart[i].display();
                    subTotal = subTotal + lineTotal;

                    System.out.println(" ");
                }
            }
        }

        if(subTotal >= 50){
            discount = subTotal * 0.08;
        }


        total = subTotal - discount;

        System.out.println("---------------------------");
        System.out.println("Sub-Total: R" + subTotal);
        System.out.println("Discount: R" + discount);
        System.out.println("Total: R" + total);




    }
}
