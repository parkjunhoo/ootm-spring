package util;

import java.text.DecimalFormat;

public class Utils {
	static DecimalFormat priceFormat = new DecimalFormat("###,###");
	
	public static String priceDot(int price) {
		return priceFormat.format(price);
	}
	
	public static String[] tagSplit(String tag) {
		return tag.split("#");
	}
	public static String tagReplaceToSpace(String tag) {
		return tag.replace("#"," ");
	}
	public static String tagReplaceToSharp(String tag) {
		return tag.replace(" ","#");
	}
}
