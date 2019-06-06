public interface IHeap {
    // 向下调整
    void AdjustDown(int[] array, int index);
    // 建堆
    void CreateHeap(int[] array);
    // 向上调整
    void AdjustUp(int[] array, int index);
  
}
