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
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Timestamp getDue_by() {
		return due_by;
	}

	public void setDue_by(Timestamp due_by) {
		this.due_by = due_by;
	}

	public Timestamp getPaid_on() {
		return paid_on;
	}

	public void setPaid_on(Timestamp paid_on) {
		this.paid_on = paid_on;
	}

	public Boolean getRecurring() {
		return recurring;
	}

	public void setRecurring(Boolean recurring) {
		this.recurring = recurring;
	}

	public Long getAmount_due() {
		return amount_due;
	}

	public void setAmount_due(Long amount_due) {
		this.amount_due = amount_due;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "paid")
    private Boolean paid;
    
    @Column(name = "due_by")
    private Timestamp due_by;
    
    @Column(name = "paid_on")
    private Timestamp paid_on;
    
    @Column(name = "recurring")
    private Boolean recurring;
    
    @Column(name = "amount_due")
    private Long amount_due;
    
    
}