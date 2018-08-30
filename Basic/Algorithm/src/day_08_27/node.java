package day_08_27;

public class node<e> {
e item;
node next;



public node() {}
public node(e item, node next) {
	this.item = item;
	this.next = next;
}

public void setItem(e item) {
	this.item = item;
}
public void setNext(node next) {
	this.next = next;
}
public e getItem() {
	return item;
}
public node getNext() {
	return next;
}

@Override
public String toString() {
	return "node [item=" + item + ", next=" + next + "]";
}



}
