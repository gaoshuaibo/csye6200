/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ticket;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Ticket {

    private String code;
    private Date expireDate;

    public Ticket() {
        code = TicketGenerater.generateCode();
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
