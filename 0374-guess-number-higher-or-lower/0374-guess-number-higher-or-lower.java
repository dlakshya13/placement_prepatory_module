/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


public class Solution extends GuessGame {
    public int guessNumber(int n) {
      while(guess(n)!=0){
          if(guess(n)==1){
             n=binarySearch(n,n*2);
          }
          else{
            n=binarySearch(1,n);
          }
      }
      return n;  
    }
    public int binarySearch(int low,int high){
        int mid=low+(high-low)/2;
        if(guess(mid)==0){
            return mid;
        }
        if(guess(mid)==1){
            return binarySearch(mid+1,high);
        }
        else{
            return binarySearch(low,mid-1);
        }
    }
    
}