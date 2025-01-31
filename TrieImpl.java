class TrieNode{
    public char val;
    public TrieNode[] children=new TrieNode[26];
    public boolean isWord;
    public TrieNode()
    {}
    public TrieNode(char alph)
    {
        TrieNode node =new TrieNode(' ');
        node.val=alph;
    }
}
class Trie {
  
    /** Initialize your data structure here. */
    TrieNode root;
    public Trie() {
        root =new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(node.children[c-'a']==null)
           
            node.children[c-'a']=new  TrieNode(c);
            node=node.children[c-'a'];
        }
                          node.isWord=true;
     }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node=root;
        for(int i=0; i < word.length();i++)
        {
            char c=word.charAt(i);
            if(node.children[c-'a']==null)
                return false;
            node=node.children[c-'a'];
               
                              
                               }
        return node.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
         TrieNode node=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(node.children[c-'a']==null)
                return false;
            node=node.children[c-'a'];
               
        }
        return true;
    }   
    }




/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */