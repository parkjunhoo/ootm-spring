package kr.team3.ootm.dao.product_image;

public class ProductImageDTO {
    private int product_image_id;
    private int product_id;
    private String product_image_url;
    
    public ProductImageDTO() {
    	
    }

    //insert용
	public ProductImageDTO(int product_id, String product_image_url) {
		this.product_id = product_id;
		this.product_image_url = product_image_url;
	}
    
    //read select 용
	public ProductImageDTO(int product_image_id, int product_id, String product_image_url) {
		this.product_image_id = product_image_id;
		this.product_id = product_id;
		this.product_image_url = product_image_url;
	}




	public int getProduct_image_id() {
		return product_image_id;
	}

	public void setProduct_image_id(int product_image_id) {
		this.product_image_id = product_image_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_image_url() {
		return product_image_url;
	}

	public void setProduct_image_url(String product_image_url) {
		this.product_image_url = product_image_url;
	}
    
    
    
}
