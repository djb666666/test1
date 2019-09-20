package com.tedu;

public class Text {
	public static void main(String[] args) {
		try {
			System.out.println("before");
			System.out.println("afterReturning");
		} catch (Exception e) {
			System.out.println("afterThrowing");
		}finally {
			System.out.println("after66666");
		}
	}
}
