package stack;

public class Implementingstack {
private int data[];
private int top;
	
public 	Implementingstack() {
	data=new int[10];
	top=-1;
}
public 	Implementingstack(int capacity) {
	data=new int[capacity];
	top=-1;
}
public boolean isempty() {
	/*if(top==-1) {
		return true;
	}
	else {
		return false;
	}*/
	return (top==-1);
	
}
public int size() {
	return top+1;
}
public int top() throws Stackempty {
	if(size()==0) {
		Stackempty e=new Stackempty();
		throw e;
	}
	return data[top];
}
/*
public void push(int ele) throws Stackfullexception{
	if(size()==data.length) {
		Stackfullexception e=new Stackfullexception();
		throw e;
	}
	top++;
	data[top]=ele;
}*/
public void push(int ele) {
	if(size()==data.length) {
		doublecapacity();
	}
	top++;
	data[top]=ele;	
}
private void doublecapacity() {
	int temp[]=data;
	data=new int[2*temp.length];
	for(int i=0;i<=top;i++) {
		data[i]=temp[i];
	}
}
public int pop() throws Stackempty {
	if(size()==0) {
		Stackempty e=new Stackempty();
		throw e;
	}
	int temp=data[top];
	top--;
	return temp;
}
}
