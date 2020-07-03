package com.allen.finances.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "expenses")
public class Expenses {

    public Expenses() {
        super();
    }

    public Expenses(long id, String name, Boolean paid, Timestamp due_by, Timestamp paid_on, Boolean recurring, Long amount_due) {
        this.id = id;
        this.name = name;
        this.paid = paid;
        this.due_by = due_by;
        this.paid_on = paid_on;
        this.recurring = recurring;
        this.amount_due = amount_due;
    }
    
}