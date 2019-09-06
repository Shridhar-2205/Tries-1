class trie{
	
	trie[] children = new trie[26];
	boolean word = false;
}

class Solution {
    public String replaceWords(List<String> dict, String sentence) {
		
		trie root = new trie();
		
		for (string s:dict){
			
			trie node = root;
			
			for (char c: s.toCharArray()){
				
				
				if(node.children[c- 'a']==null){
					
					
					node.children[c- 'a'] =  new trie();
					
					
					
				}
				node = node.children[c- 'a'];
				
				
			}
			node.word = true;
			
		}
		
		String answer = new String();
		
		for (String str: sentence.split(" "))
		{
			
			trie node = root;
			StringBuilder temp = new StringBuilder();
			
			for (char ch: str.toCharArray()){
				
				if(node.children[ch- 'a']==null && node.word){
					
					temp.append(ch);
					node = node.children[ch- 'a'];
				}
				else
					break;
			}
			
			if (temp!=null && node.word && answer.isEmpty()){
				
				answer = answer + temp.toString();
				
				
			}
			else{
				if(temp!=null && node.word){
					
					answer = answer + " " +temp.toString(); 
				}
				else
					if( answer.isEmpty()){
						answer += str;
					}
					else
						answer+= " "+str;
					
				
			}
			return answer;
			
		}
		
		
		
        
    }
}