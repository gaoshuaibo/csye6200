/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ticket;


/**
 *
 * @author Alex
 */
public class TicketGenerater {

    public static String generateCode() {
        String code = "";
        int temp;
        for (int index = 0; index < 10; index++) {
            temp = extractNumber(9);
            code = code + String.valueOf(temp);
        }
        return code;
    }

    private static int extractNumber(int max) {
        return (int) (Math.random() * max + 1);
    }

    public static Ticket generateTicket() {
        Ticket ticket = new Ticket();
        return ticket;
    }
}
