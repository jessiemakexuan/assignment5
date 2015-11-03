package pattern;

import java.util.HashMap;

public class MatchPattern {
	public boolean wordPattern(String pattern, String str) throws MatchException{
		  HashMap<String, String> match=new HashMap<String, String>(); 
		  String[] chaP=pattern.split("");
		  String[] chaS=str.split(" ");
		  if(chaP.length!=chaS.length){
			  MatchException me=new MatchException("Exception: Length is not match");
			  throw me;
		  }
		  for(int i=0;i<chaP.length;i++){
			  match.put(chaP[i], chaS[i]);
		  }
		  String newStr=match.get(chaP[0]);
		  for(int i=1;i<chaP.length;i++){
			  newStr=newStr+" "+match.get(chaP[i]);
		  }
		  if(newStr.equals(str)){
			  return true;
		  }else{
			  return false;
		  }
		  
	}

	public static void main(String[] args) throws Exception{
		String pattern = "abaa"; 
		String str = "dog cat dog dog"; 
		MatchPattern mp=new MatchPattern();
		try{
			if(mp.wordPattern(pattern, str)){
				System.out.println("match");
			}else{
				System.out.println("Not match");
			}
		}catch(MatchException me){
			System.out.println(me.getMessage());
		}
	}
}

class MatchException extends Exception{
	public MatchException(String message){
		super(message);
	}

}
