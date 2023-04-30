package kr.team3.ootm.dao.product;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ProductDAOImpl implements ProductDAO{
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public int insert(ProductDTO product) {
		return template.update("insert into product() values(null,?,?,?,?,?,?,?,?,'y',now(),?,?,?)", 
				product.getProduct_category_id(),
				product.getProduct_sub_category_id(),
				product.getProduct_name(),
				product.getProduct_price(),
				product.getProduct_discount_rate(),
				product.getProduct_content(),
				product.getProduct_image(),
				product.getProduct_image2(),
				product.getProduct_quantity(),
				product.getProduct_sale_rate(),
				product.getProduct_tag());
	}

	@Override
	public ProductDTO read(int product_id) {
		return template.queryForObject("select * from product where product_id = ?", 
				new Object[] {product_id}, new ProductRowMapper());
	}
	

	@Override
	public int delete(int product_id) {
		return 1;
	}

	@Override
	public List<ProductDTO> selectAllProduct() {
		return template.query("select * from product",new ProductRowMapper());
	}

	@Override
	public ArrayList<ProductDTO> selectBestProduct(int amount) {
		//spring jdbc를 연동한다면
		//dao상위하위서비스상위하위 arrayList 들어간부분 list로 바구고
		//sql = "select * from product order by product_sale_rate desc limit ?";
		//return template.query(sql, 
		//new Object[] {amount}, new ProductRowMapper());
		//밑에 잇는 new도 비슷한방법으로 order by regdate
		//아직 프로덕트에 의미잇는ㄷ ㅔ이터들이 없기에 
		//대충 포문으로 랜덤으로 넣어서 리턴중.,
		
		
		
		// db연동 없이 일단 리스트 amount개
		ArrayList<ProductDTO> result = new ArrayList<ProductDTO>();
		Random r = new Random();
		
		for(int i=0; i<amount; i++) {
			int price = r.nextInt(95001)+5000; // 5000~100000
			int categoryMax = r.nextInt(8)+1; // 1~8
			int saleRate = r.nextInt(4000); // 0~4000
			result.add(new ProductDTO(i,categoryMax,1,i+"번 베스트상품",price,5,"멋진옷입니다.",
				"http://www.everfree.co.kr/shopimages/manish/0140030005522.jpg?1651031042",
				"http://www.everfree.co.kr/shopimages/manish/014003000552.jpg?1651030706",
				"y", new Timestamp(System.currentTimeMillis()),
				300,saleRate,"#멋진옷#멋잘알"));
		}
		//
		return result;
	}
	
	@Override
	public ArrayList<ProductDTO> selectNewProduct(int amount) {
		// db연동 없이 일단 리스트 amount개
		ArrayList<ProductDTO> result = new ArrayList<ProductDTO>();
		Random r = new Random();
		
		for(int i=0; i<amount; i++) {
			int price = r.nextInt(95001)+5000; // 5000~100000
			int categoryMax = r.nextInt(8)+1; // 1~8
			int saleRate = r.nextInt(4000); // 0~4000
			result.add(new ProductDTO(i,categoryMax,1,i+"번 신상품",price,5,"멋진옷입니다.",
				"http://www.everfree.co.kr/shopimages/manish/0140030005522.jpg?1651031042",
				"http://www.everfree.co.kr/shopimages/manish/014003000552.jpg?1651030706",
				"y", new Timestamp(System.currentTimeMillis()),
				300,saleRate,"#멋진옷#멋잘알"));
		}
		//
		return result;
	}
	
}
