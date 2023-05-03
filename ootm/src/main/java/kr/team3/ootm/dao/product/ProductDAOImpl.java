package kr.team3.ootm.dao.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private JdbcTemplate template;

	@Override
	public int insert(ProductDTO product) {
		return template.update("insert into product() values(null,?,?,?,?,?,?,?,?,'y',now(),?,?,?)",
				product.getProduct_category_id(), product.getProduct_sub_category_id(), product.getProduct_name(),
				product.getProduct_price(), product.getProduct_discount_rate(), product.getProduct_content(),
				product.getProduct_image(), product.getProduct_image2(), product.getProduct_quantity(),
				product.getProduct_sale_rate(), product.getProduct_tag());
	}

	@Override
	public ProductDTO read(int product_id) {
		ProductDTO result = null;
		try {
			result= template.queryForObject("select * from product where product_id = ?", 
					new Object[] {product_id}, new ProductRowMapper());
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
		
		
		return result;
	}

	@Override
	public int delete(int product_id) {
		return 1;
	}

	@Override
	public List<ProductDTO> selectAllProduct() {
		return template.query("select * from product", new ProductRowMapper());
	}

	@Override
	public List<ProductDTO> selectBestProduct(int amount) {
		String sql = "select * from product order by product_sale_rate desc limit ?";

		List<ProductDTO> result = template.query(sql, new Object[] { amount }, new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectNewProduct(int amount) {
		String sql = "select * from product order by product_regdate desc limit ?";

		List<ProductDTO> result = template.query(sql, new Object[] { amount }, new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectByCategoryOrderByNew(int product_category_id) {
		String sql = "select * from product where product_category_id = ? order by product_regdate desc";
		List<ProductDTO> result = template.query(sql, new Object[] { product_category_id }, new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectBySubCategoryOrderByNew(int product_sub_category_id) {
		String sql = "select * from product where product_sub_category_id = ? order by product_regdate desc";
		List<ProductDTO> result = template.query(sql, new Object[] { product_sub_category_id }, new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectByCategoryOrderByBestLimit(int product_category_id, int min, int max) {
		String sql = "select * from product where product_category_id = ? order by product_regdate desc limit ?, ?";
		List<ProductDTO> result = template.query(sql, new Object[] { product_category_id, min, max },
				new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectBySubCategoryOrderByBestLimit(int product_sub_category_id, int min, int max) {
		String sql = "select * from product where product_sub_category_id = ? order by product_regdate desc limit ? , ?";
		List<ProductDTO> result = template.query(sql, new Object[] { product_sub_category_id, min, max },
				new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectByCategoryOrderByPriceLimit(int product_category_id, int min, int max) {
		String sql = "select * from product where product_category_id = ? order by product_price limit ?, ?";
		List<ProductDTO> result = template.query(sql, new Object[] { product_category_id, min, max },
				new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectBySubCategoryOrderByPriceDescLimit(int product_sub_category_id, int min, int max) {
		String sql = "select * from product where product_sub_category_id = ? order by product_price desc limit ? , ?";
		List<ProductDTO> result = template.query(sql, new Object[] { product_sub_category_id, min, max },
				new ProductRowMapper());

		return result;
	}

	/////// 페이지네이션을 쓸때 사용해야할것같습니다
	// min max
	// ex:) 해당 카테고리 상품의 갯수를 받아온뒤 1페이지에 limit 0 , 10 , 2페이지에 10, 20 ...
	@Override
	public int countByCategory(int product_category_id) {
		String sql = "select count(*) from product where product_category_id = ?";
		int count = template.queryForObject(sql, Integer.class);
		return count;
	}

	/////// 페이지네이션을 쓸때 사용해야할것같습니다
	@Override
	public int countBySubCategory(int product_sub_category_id) {
		String sql = "select count(*) from product where product_sub_category_id = ?";
		int count = template.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public List<ProductDTO> selectByCategoryOrderByNewLimit(int product_category_id, int min, int max) {
		String sql = "select * from product where product_category_id = ? order by product_regdate desc limit ? , ?";
		List<ProductDTO> result = template.query(sql, new Object[] { product_category_id, min, max },
				new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectBySubCategoryOrderByNewLimit(int product_sub_category_id, int min, int max) {
		String sql = "select * from product where product_sub_category_id = ? order by product_regdate desc limit ? , ?";
		List<ProductDTO> result = template.query(sql, new Object[] { product_sub_category_id, min, max },
				new ProductRowMapper());

		return result;
	}

	@Override
	public List<ProductDTO> selectByKeyword(String keyword) {
		String sql = "SELECT DISTINCT p.* " + "FROM product p "
				+ "INNER JOIN product_category c ON p.product_category_id = c.product_category_id "
				+ "LEFT JOIN product_sub_category s ON p.product_sub_category_id = s.product_sub_category_id "
				+ "WHERE CONCAT(p.product_name, ' ', p.product_tag, ' ', c.product_category_name, ' ', s.product_sub_category_name) LIKE ? ";

		List<ProductDTO> list = template.query(sql, new Object[] { "%" + keyword + "%" }, new ProductRowMapper());

		return list;
	}

}
