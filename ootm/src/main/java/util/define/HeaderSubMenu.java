package util.define;

//ENUM 사용법
//ProductCategory.OUTER.getValue() == outer에 해당하는 int 반환 ==> 1반환 해당 밸류값은 product_category_id 와 일치함
//
public enum HeaderSubMenu{
	
	SUB1("New(10% SALE)",1,"new"),
	SUB2("BEST",2,"best"),
	SUB3("OUTER",3,"outer"),
	SUB4("SHIRT",4,"shirt"),
	SUB5("LONG SLEEVE",5,"longsleeve"),
	SUB6("KNIT",6,"knit"),
	SUB7("SHORT SLEEVE",7,"shortsleeve"),
	SUB8("JEAN",8,"jean"),
	SUB9("PANTS",9,"pants"),
	SUB10("SHORT GUYS",10,"shortguys"),
	SUB11("SHOES",11,"shoes"),
	SUB12("BAG",12,"bag"),
	SUB13("ACCESSORIES",13,"acc"),
	SUB14("SEASON OFF",14,"seansonoff"),
	SUB15("SUIT",15,"suit"),
	SUB16("SET EVENT",16,"setevent");

    private final String label;
    private final int hsmId;
    private final String param;

    HeaderSubMenu(String label, int hsmId , String param) {
    	this.label = label;
    	this.hsmId = hsmId; 
    	this.param = param;
	}

    public int getHsmId() { return hsmId; }
    public String getLabel() { return label; }
    public String getParam() { return param; }
    
    public static String getLabel(int value) {
        for (HeaderSubMenu c : HeaderSubMenu.values()) {
            if (c.getHsmId() == value) {
                return c.getLabel();
            }
        }
        return null;
    }
    
    public static String getParam(int value) {
        for (HeaderSubMenu c : HeaderSubMenu.values()) {
            if (c.getHsmId() == value) {
                return c.getParam();
            }
        }
        return null;
    }
    
   
    
}
