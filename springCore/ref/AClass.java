package com.ranjan.springCore.ref;

public class AClass {
	private int val;
	private BClass objb;
	public AClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	public BClass getObjb() {
		return objb;
	}
	public void setObjb(BClass objb) {
		this.objb = objb;
	}
	@Override
	public String toString() {
		return "AClass [val=" + val + ", objb=" + objb + "]";
	}
	
}
