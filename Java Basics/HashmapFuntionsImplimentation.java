import java.util.*;

public class HashmapFuntionsImplimentation {
    
    public class HashMap<K,V>{                 //generic parameters(we dont know yet what type of values we are going to pass so we use variables)   
   
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }


        private int n;
        private int N;
        private LinkedList<Node> buckets[];    //just like (private int arr[]) where it is an array(named buckets) of linkedlist


        @SuppressWarnings("unchecked")         //used to avoid warnings after running the code (here it is used to avoid warning as we are not assigning the datatype that is going to be stored in the linkedlist)
        public HashMap(){
            this.n=4;                          //Total number of nodes
            this.buckets=new LinkedList[4];    //before linkedlist, no information about what type of data is going to be stored inside so it might show error
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
            this.N=buckets.length;             //Size of the array
        }


        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%N;
        }


        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll= buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
    

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets = new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }


        public void put(K key,V value){
            int bi = hashFunction(key);       //0 to 3
            int di = SearchInLL(key,bi);     //is key is there then it will return the index or else it will return -1

            if(di!=-1){
                Node node = buckets[bi].get(di);
                node.value=value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double lamda=n/N;
            if(lamda>2.0){
                rehash();
            }
        }


        public boolean containsKey(K key){
            int bi = hashFunction(key);       //0 to 3
            int di = SearchInLL(key,bi);     //is key is there then it will return the index or else it will return -1

            if(di!=-1){
                return true;
            }
            else{
                return false;
            }
        }


        public V get(K key){
            int bi = hashFunction(key);       //0 to 3
            int di = SearchInLL(key,bi);     //is key is there then it will return the index or else it will return -1

            if(di!=-1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }


        public V remove(K key){
            int bi = hashFunction(key);       //0 to 3
            int di = SearchInLL(key,bi);     //is key is there then it will return the index or else it will return -1

            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }


        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }


        public boolean isEmpty(){
            return n==0;
        }

    }


    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Bhutan", 5);
        hm.put("Nepal", 6);
        hm.put("Indonesia", 20);

        ArrayList<String> keys=hm.keySet();
        for(String string : keys){
            System.out.println(string);
        }
    }
}
