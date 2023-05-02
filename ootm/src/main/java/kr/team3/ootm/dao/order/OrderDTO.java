package kr.team3.ootm.dao.order;



import java.sql.Timestamp;

public class OrderDTO {
    private int order_number;
    private Timestamp order_date;

    public OrderDTO() {
    	
    }
    
    
    
    public OrderDTO(int order_number, Timestamp order_date) {
		this.order_number = order_number;
		this.order_date = order_date;
	}



	public int getOrder_number() {
		return order_number;
	}



	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}



	public Timestamp getOrder_date() {
		return order_date;
	}



	public void setOrder_date(Timestamp order_date) {
		this.order_date = order_date;
	}

    
}

