package com.axing.StudentManagementSystem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    public static void main(String[] args) {

        // 将十进制数字转换为二进制字符串
//        Scanner sc = new Scanner(System.in);
//        int i = Integer.parseInt(sc.nextLine());
//        System.out.println(toBinaryStr(i));


        // 二分查找练习
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(binarySearch(arr, 111));

        // 分块查找练习
        /*
        分块查找
        核心思想：
            块内无序，块间有序
        实现步骤：
            1.创建数组blockArr存放每一个块对象的信息
            2.先查找blockArr确定要查找的数据属于哪一块
            3.再单独遍历这一块数据即可
        */
//        int[] arr = {16, 5, 9, 12, 21, 18,
//                32, 23, 37, 26, 45, 34,
//                50, 48, 61, 52, 73, 66};
//        Block b1 = new Block(21, 0, 5);
//        Block b2 = new Block(45, 6, 11);
//        Block b3 = new Block(73, 12, 17);
//        ArrayList<Block> blocks = new ArrayList<>();
//        blocks.add(b1);
//        blocks.add(b2);
//        blocks.add(b3);
//        System.out.println(blockSearch(blocks, arr, 5));

        int[] arr = {6, 2, 7, 9, 3, 4, 5, 1, 10, 8};
        int[] arr2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        // 冒泡排序练习
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

        // 选择排序练习
//        selectSort(arr);
//        System.out.println(Arrays.toString(arr));

        // 插入排序
//        insertSort(arr);
//        System.out.println(Arrays.toString(arr));


        // 快速排序
        quickSort(arr2, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr2));
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (i > j) {
            return;
        }
        while (start != end) {
            // 让end指向第一个    比基数小的 数的下标
            while (true) {
                if (arr[end] < arr[i] || start >= end) {
                    break;
                }
                end--;
            }
            while (true) {
                if (arr[start] > arr[i] || start >= end) {
                    break;
                }
                start++;
            }
            swap(arr, start, end);

        }
        swap(arr, i, start);

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
    // 将十进制数字转换为二进制字符串

    public static String toBinaryStr(int i) {
        StringBuilder sb = new StringBuilder();
        System.out.println(Integer.toBinaryString(i));
        while (i != 0) {
            sb.append(i % 2);
            i /= 2;
        }
        sb.reverse();
        return sb.toString();
    }
    // 二分查找

    public static int binarySearch(int[] arr, int num) {
        int min = 0, max = arr.length - 1;
        int mid;
        while (true) {
            if (min > max) {
                return -1;
            }
            mid = (min + max) / 2;
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
    // 分块查找

    public static int blockSearch(ArrayList<Block> blocks, int[] arr, int num) {
        int index = blockSearchIndex(blocks, num);
        if (index == -1) {
            return -1;
        }
        int start = blocks.get(index).getStartIndex();
        int end = blocks.get(index).getEndIndex();
        for (int i = start; i <= end; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;

    }
    // 在索引表中查找“指定值”所在块的索引

    private static int blockSearchIndex(ArrayList<Block> blocks, int num) {
        for (int i = 0; i < blocks.size(); i++) {
            if (blocks.get(i).getMaxValue() >= num) {
                return i;
            }
        }
        return -1;
    }
    // 冒泡排序

    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
    // 选择排序

    public static void selectSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    // 插入排序

    public static void insertSort(int[] arr) {
        // 首先找到无序的数组的起始索引
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
            }
        }
        // 通过起始索引逐步向有序数组插入数据
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int t = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = t;
                j--;
            }
        }

    }
    // 快速排序

    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }


}

class Block {
    private int maxValue;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int maxValue, int startIndex, int endIndex) {
        this.maxValue = maxValue;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return maxValue
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * 设置
     *
     * @param maxValue
     */
    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{maxValue = " + maxValue + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
