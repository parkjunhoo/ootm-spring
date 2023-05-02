package util.define;

//ENUM 사용법
//ProductCategory.OUTER.getValue() == outer에 해당하는 int 반환 ==> 1반환 해당 밸류값은 product_category_id 와 일치함
//
public enum ProductCategory{
	
	OUTER(1),
	TOP(2),
	BOTTOM(3),
	ACCESSORIES(4),
	SUIT(5);

    private final int value;

    ProductCategory(int value) { this.value = value; }

    public int getValue() { return value; }
    
    public static String getName(int value) {
        for (ProductCategory c : ProductCategory.values()) {
            if (c.getValue() == value) {
                return c.toString().replace("_", " ");
            }
        }
        return null;
    }
}
