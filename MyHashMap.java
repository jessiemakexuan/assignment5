package myHashMap;

import java.util.ArrayList;

/*Understand the principles of HashMap, read the source code of HashMap in Java library, 
 * then design and implement your own HashMap using array. 
 * It should at least support get, set, etc functions.*/
public class MyHashMap <Key,Value>{
	ArrayList<Key> k=new ArrayList<Key>();
	ArrayList<Value> v=new ArrayList<Value>();
	
	public void set(Key key,Value value) throws InputException{
		if(key==null||value==null) {
			InputException ie=new InputException("Exception:Null Input");
			throw ie;
		}
		if(containKey(key)){
			int i=0;
			for(;i<k.size();i++){
				if(k.get(i)==key)
					break;
			}
			v.set(i, value);
			return;
		}
		k.add(key);
		v.add(value);
	}
	
	public Value get(Key key) throws InputException{
		if(key==null) {
			InputException ie=new InputException("Exception:Null Input");
			throw ie;
		}
		
		for(int i=0;i<k.size();i++){
			if(k.get(i)==key){
				return v.get(i);
			}
		}
		return null;
	}
	
	public boolean containKey(Key key) throws InputException{
		if(key==null) {
			InputException ie=new InputException("Exception:Null Input");
			throw ie;
		}
		for(int i=0;i<k.size();i++){
			if(k.get(i)==key){
				return true;
			}
		}
		return false;
	}
	
	public boolean containValue(Value value) throws InputException{
		if(value==null) {
			InputException ie=new InputException("Exception:Null Input");
			throw ie;
		}
		for(int i=0;i<v.size();i++){
			if(v.get(i)==value){
				return true;
			}
		}
		return false;
	}

	public boolean isEmpty() {
        return k.size() == 0;	 
    }
	
	public int size() {
       return k.size();	  
    }
  
}

class InputException extends Exception {
	public InputException(String message) {
		super(message);
	}

}