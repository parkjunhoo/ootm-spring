package kr.team3.ootm.dao.product;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public int insert(ProductDTO product) {
		/////////////DB에서 insert하는 코드
		
		/////////////
		
		return 1;
	}

	@Override
	public ProductDTO read(int product_id) {
		////////////////DB에서 읽은 코드
		
		////////////////
		return new ProductDTO(1,1,1,"상품이름",5000,5,"멋진옷입니다.",
				"http://www.everfree.co.kr/shopimages/manish/0140030005522.jpg?1651031042",
				"http://www.everfree.co.kr/shopimages/manish/014003000552.jpg?1651030706",
				"y", new Date(System.currentTimeMillis()),
				300,0,"#멋진옷#멋잘알");
	}
	

	@Override
	public int delete(int product_id) {
		return 1;
	}

	@Override
	public ArrayList<ProductDTO> selectAllProduct() {
		// db연동 없이 일단 리스트 50개
		ArrayList<ProductDTO> result = new ArrayList<ProductDTO>();
		Random r = new Random();
		
		for(int i=0; i<50; i++) {
			int price = r.nextInt(95001)+5000; // 5000~100000
			int categoryMax = r.nextInt(8)+1; // 1~8
			int saleRate = r.nextInt(4000); // 0~4000
			result.add(new ProductDTO(i,categoryMax,1,i+"번 상품",price,5,"멋진옷입니다.",
				"http://www.everfree.co.kr/shopimages/manish/0140030005522.jpg?1651031042",
				"http://www.everfree.co.kr/shopimages/manish/014003000552.jpg?1651030706",
				"y", new Date(System.currentTimeMillis()),
				300,saleRate,"#멋진옷#멋잘알"));
		}
		//
		return result;
	}

	@Override
	public ArrayList<ProductDTO> selectBestProduct(int amount) {
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
				"y", new Date(System.currentTimeMillis()),
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
				"y", new Date(System.currentTimeMillis()),
				300,saleRate,"#멋진옷#멋잘알"));
		}
		//
		return result;
	}
	
}
