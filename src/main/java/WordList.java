import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
   for(int i = 0; i < myList.size(); i ++){
     if(myList.get(i).length().equals(len)){
       count++;
     }
   }
    return count;
    
  }

  public void removeWordsOfLength(int len)
  {
    for(int c = 0; c < myList.size(); c++){
      if(myList.get(c).length().equals(len){
        myList.remove(c);
        c--;
      }
    } 

  }
}
