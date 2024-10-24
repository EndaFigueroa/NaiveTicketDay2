// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Naive Ticket running.");
        TicketMachine pizza = new TicketMachine(300);
        System.out.println(pizza.getPrice());
        pizza.insertMoney(200);
        System.out.println(pizza.getBalance());
        pizza.printTicket();
        System.out.println(pizza.getBalance());
        pizza.insertMoney(1999);
        System.out.println(pizza.getBalance());

        TicketMachine gir = new TicketMachine(3);
        gir.insertMoney(3);
        gir.printTicket();
        // @Test
        // void addition() {
        //     assertEquals(2, 1 + 1);
        // }
    }
}