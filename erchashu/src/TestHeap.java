public class TestHeap {
    private int[] elem;
    private int usedSize;
    private static final int DEFAULT_SIZE = 10;
    public TestHeap(){
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    public void initHead(int[] array){
        for(int i = 0;i<array.length;i++){
            this.elem[i] = array[i];
            this.usedSize++;
        }
        for (int i = (array.length-1-1)/2; i >=0 ; i--) {
            AdjustDown(i,this.usedSize);

        }
    }

    public void AdjustDown(int root,int len){
        int parent = root;
        int child = 2*parent+1;
        while(child < len){

            if(child+1<len && elem[child] < elem[child+1]){
                ++child;
            }
            //child下标存放的是左右孩子的最大最
            if(elem[child] > elem[parent]){
                //交换
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else{
                break;
            }
        }
    }
    public  void show(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(elem[i]);
        }
    }
}
