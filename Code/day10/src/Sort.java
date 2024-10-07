public class Sort {
    //使用模板 main+Tab
    public static void main(String[] args) {
        MyTools tool = new MyTools();
        int[] arr = {1, 2, 5, 3, 9, 3, 7};
        tool.bubble(arr);
    }
}

class MyTools {
    String name;
    int quantity;

    //构造器-快捷键 右键+Generate+Constructor+Ctrl选择所以需要的属性
    //public MyTools(int quantity, String name) {
    //    this.quantity = quantity;
    //    this.name = name;
    //}

    public void bubble(int[] arr) {
        //for遍历数组的时候发生警告‘for’ loop replaceable with enhanced ‘for’
        //循环里用于条件判断的变量 i 在循环体内没有使用，所以IDEA发出警告。
        //可以使用foreach遍历整个数组
        for (int i : arr) {
            System.out.print(arr[i] + " ");
        }
        //for(int i=0;i<arr.length;i++){
        //    System.out.print(arr[i]+" ");
        //}
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}