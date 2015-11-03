package brackets;

/*find out if there is single bracket*/
public class FindSingleBracket {
	//find brackets in s
	public boolean isValid(String s) throws OtherCharException {
	    char brackets[]= s.toCharArray();
	    for(int i =0;i<brackets.length;i++){
	    	if(brackets[i]=='(' | brackets[i]==')' | brackets[i]=='[' | brackets[i]==']'|brackets[i]=='{'|brackets[i]=='}'){
	    		continue;
	    	}else{
	    		OtherCharException oce=new OtherCharException("Exception:wrong input");
	    		throw oce;
	    	}
	    }
	    if(brackets.length%2!=0){
	    	return false;
	    }
	    for(int i=0; i<brackets.length;i=i+2){
	    	if(brackets[i]=='('){
	    		if(brackets[i+1]==')'){
	    			if(i==(brackets.length-2)){
	    				return true;
	    			}
	    			continue;
	    		}else{
	    			return false;
	    		}
	    	}
	    	if(brackets[i]=='['){
	    		if(brackets[i+1]==']'){
	    			if(i==(brackets.length-2)){
	    				return true;
	    			}
	    			continue;
	    		}else{
	    			return false;
	    		}
	    	}
	    	if(brackets[i]=='{'){
	    		if(brackets[i+1]=='}'){
	    			if(i==(brackets.length-2)){
	    				return true;
	    			}
	    			continue;
	    		}else{
	    			return false;
	    		}
	    	}
	    	break;
	    }
	    return false;
	}

	public static void main(String[] args) throws Exception{
		String s="()[]{";
		FindSingleBracket fsb=new FindSingleBracket();
		try{
			if(fsb.isValid(s)){
				System.out.println("this input string is valid");
			}else{
				System.out.println("have single bracket");
			}
		}catch(OtherCharException oce){
			System.out.println(oce.getMessage());
		}
	}
}

class OtherCharException extends Exception {
	public OtherCharException(String message){
		super(message);
	}
}