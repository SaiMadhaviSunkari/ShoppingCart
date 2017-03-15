package org.myProject.shoppingOnline;

public class shoppingCartItem {
private int itemno;
private String itemName;
private int pricePerUnit;
private int quantity=0;
public shoppingCartItem(int itemno, String itemName, int pricePerUnit,int quantity) {
	super();
	this.itemno = itemno;
	this.itemName = itemName;
	this.pricePerUnit = pricePerUnit;
	this.quantity=quantity;
}
public int getItemno() {
	return itemno;
}
public void setItemno(int itemno) {
	this.itemno = itemno;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getPricePerUnit() {
	return pricePerUnit;
}
public void setPricePerUnit(int pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
