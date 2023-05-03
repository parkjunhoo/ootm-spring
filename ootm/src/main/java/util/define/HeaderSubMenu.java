package util.define;

//ENUM 사용법
//ProductCategory.OUTER.getValue() == outer에 해당하는 int 반환 ==> 1반환 해당 밸류값은 product_category_id 와 일치함
//
public enum HeaderSubMenu{
	
	SUB1("New(10% SALE)",1),
	SUB2("BEST",2),
	SUB3("OUTER",3),
	SUB4("SHIRT",4),
	SUB5("LONG SLEEVE",5),
	SUB6("KNIT",6),
	SUB7("SHORT SLEEVE",7),
	SUB8("JEAN",8),
	SUB9("PANTS",9),
	SUB10("SHORT GUYS",10),
	SUB11("SHOES",11),
	SUB12("BAG",12),
	SUB13("ACCESSORIES",13),
	SUB14("SEASON OFF",14),
	SUB15("SUIT",15),
	SUB16("SET EVENT",16);

    private final String label;
    private final int hsmId;

    HeaderSubMenu(String label, int hsmId) {
    	this.label = label;
    	this.hsmId = hsmId; 
	}

    public int getHsmId() { return hsmId; }
    public String getLabel() { return label; }
    
    public static String getLabel(int value) {
        for (HeaderSubMenu c : HeaderSubMenu.values()) {
            if (c.getHsmId() == value) {
                return c.getLabel();
            }
        }
        return null;
    }
    
   
    
}
