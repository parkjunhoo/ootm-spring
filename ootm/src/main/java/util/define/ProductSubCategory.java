package util.define;

public enum ProductSubCategory {
	
	CARDIGAN(1),
	JACKET(2),
	BLAZER(3),
	COAT(4),
	PADDING(5),
	SHIRT(6),
	LONG_SLEEVE(7),
	KNIT(8),
	SHORT_SLEEVE(9),
	JEAN(10),
	PANTS(11),
	SHORT_GUYS(12),
	SHOES(13),
	BAG(14),
	ACCESSORY(15),
	SUIT(16);
	

    private final int value;

    ProductSubCategory(int value) { this.value = value; }

    public int getValue() { return value; }
    
    public static String getName(int value) {
        for (ProductSubCategory c : ProductSubCategory.values()) {
            if (c.getValue() == value) {
            	return c.toString().replace("_", " ");
            }
        }
        return null;
    }
}
