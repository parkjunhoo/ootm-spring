package kr.team3.ootm.controller;

import util.define.HeaderSubMenu;
import util.define.ProductCategory;
import util.define.ProductSubCategory;

public class HowToUseEnum_neveruse {

	public static void main(String[] args) {
		System.out.println(ProductCategory.getName(1));
		System.out.println(ProductCategory.getName(2));
		System.out.println(ProductCategory.getName(3));
		System.out.println(ProductCategory.getName(4));
		System.out.println(ProductCategory.getName(5));
		
		System.out.println("=========================");
		
		System.out.println(ProductSubCategory.getName(1));
		System.out.println(ProductSubCategory.getName(2));
		System.out.println(ProductSubCategory.getName(3));
		System.out.println(ProductSubCategory.getName(4));
		System.out.println(ProductSubCategory.getName(7));// _값이 들어가는것은 띄어쓰기로 교체하도록 내부에서 처리되어있음.
		
		System.out.println("=========================");
		System.out.println(HeaderSubMenu.getLabel(1));
		System.out.println(HeaderSubMenu.getParam(1));
	}

}
