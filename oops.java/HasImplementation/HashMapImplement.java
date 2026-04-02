package HasImplementation;
// internally array of ll use kar ke ham log has map ko implement kartte hai
// yha pe har ek array ke box jisko bucket bhi bolte hai yha pe ek LL store hota hai and 
// har ek LL ke element pe apne data ka key , value pair store haota hai
// operartions
//.put("Key")
//.containsKey(
//.get();
//.remove();
//
import java.util.*;
public class HashMapImplement {
    static class HashMap<K,V> { // hera K and V are Generics i.e means General Type // this Class isAcxutualyy HashMsap Class
        private class Node {
            K key; 
            V value;
             public Node (K key, V value ) { // constructor
               this.key = key; // key me yha pe hamne key assign kar de similar to value
               this.value = value;
             }
        } // private class se yha tak hamne LL ke Node ka struvture bna Liya

        // below three is the varriable we take
         private int  n;  // n - nodes 
         private   int N; // N - buckets
          private LinkedList<Node> buckets[] ; // N = Bucket.length // yha pe buckets Array hai jiska type hai LinkledList<Node> 
          // this is our actually HashMap jsike andar ham sare node and data ko store karenge
          
          @SuppressWarnings("unchecked")  // to check warning 

           
        public HashMap  () {  //ye above HashMap class ka constructor hai 
             this.N = 4;
             this.buckets = new LinkedList [4];
             for(int i=0; i<4; i++ ) {
              this.buckets[i] = new LinkedList<>();
             }
          }
          private int hashFunction ( K key ) { // 0 to N-1;
             int bi = key.hashCode(); // java inbuild function.hashCode();
              return  Math.abs(bi) % N ; //to only for +ve number math;abs fiunction use and dividecv by N because of hash function only belkong to 0 to N-1;

          }
          private int searchInLL (K Key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i= 0; i<ll.size(); i++) {
              if (ll.get(i).key == Key) {
                return i; // di
              }
            }
            return-1;

          }
          @SuppressWarnings("unchecked")  // to check warning 
          private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2]; // khali buckets banyi hai for rehashging ke liye
            for ( int i=0; i<N*2; i++) {
              buckets[i] = new LinkedList<>();
            }
            
            for (int i= 0; i<oldBuckets.length; i++ ) {
            LinkedList<Node> ll = oldBuckets[i];
            for (int j= 0; j<ll.size(); j++) {
              Node node = ll.get(j);
              put(node.key, node.value);
            }
            }
          }

          public void put (K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL ( key, bi) ; // di = -1;
            if (di == -1 ) { // key doesn^t exist beacse data index hi  zoro hai  MATLAB ll NULL HAI 
              buckets[bi].add(new Node(key, value));
             n++;
            } else { // Key Exist
              Node node = buckets[bi].get(di);
              node.value = value;
            }
            double lambda = (double)n/N;
            if (lambda > 2.0 ) {
              rehash();
              //rehashing
            }

          }


          public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if( di == -1 ){
              return false;
            } else {
              // key exist
              return true;
            }
          }


          public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if ( di == -1 ) {
              return null ;

            } else { // key exist
           Node node = buckets[bi].remove(di);
           n--;
           return node.value;
            }
          }

          public V get (K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
             if ( di == -1) { // key doesnot exist
              return null;
            } else { // key exist
             Node node = buckets[bi].get(di);
             return node.value;
            }
          }
          public ArrayList<K> KeySet() { // hashmap me maujaud sare key ka ewk se bna rha hai ye function
            ArrayList<K> keys = new ArrayList<>();

            for ( int i = 0; i<buckets.length; i++) {
              LinkedList<Node> ll = buckets[i];
              for ( int j =0; j<ll.size();j++){
                Node node = ll.get(j);
                keys.add(node.key);
              }
            }
            return keys;
          }
          public boolean isEmpty() {
            return n==0;
          }
        }
          public static void main(String[] args) {
           HashMap<String,Integer> map = new HashMap<>(); // ye ham java ke inbuild hash map use nhi kar rhe hai hamne jo yha pe hashmap (HashMap <K, V> ) ko jo class bnaye hao uske object ko use kar rhe hai   
           map.put("India", 200);// average time complexity of put function is O(lemda) i.e constand time
           // worst t.c = O(n)
           map.put("china", 150);
           map.put("america", 50);

           ArrayList<String> keys = map.KeySet();
           for ( int i =0; i<keys.size(); i ++ ) {
            System.out.println(keys.get(i)+ map.get(keys.get(i)));
           }
           map.remove("India");
           System.out.println(map); 
        
          }

    }
    

