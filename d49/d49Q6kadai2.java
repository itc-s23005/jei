// s23005
// d49Q6に追加で中央値を求めるプログラム

import java.util.Arrays;

public class d49Q6kadai02 {
    public static void main(String[] arguments) {
        int[] nums = new int[arguments.length];

        int i = 0;
        for (String arg : arguments) {
            nums[i++] = Integer.parseInt(arg);
        }

        Analyzer analyzer = new Analyzer();
        analyzer.setNums(nums);
        System.out.println(analyzer.analyze());
    }
}

class Analyzer {
    int[] nums;

    void setNums(int[] nums) {
        this.nums = nums;
    }

    String analyze() {
        StringBuilder sb = new StringBuilder();

        double avg = getAverage();
        sb.append("平均値: ").append(avg).append("\n");

        int r = getRange();
        sb.append("値の範囲: ").append(r).append("\n");

        int[] counts = getHighLowCounts(avg);
        sb.append("平均より大きい値の個数: ").append(counts[0])
          .append(" 平均より小さい値の個数: ").append(counts[1]).append("\n");

        double median = getMedian();
        sb.append("中央値: ").append(median).append("\n");

        return sb.toString();
    }

    private double getAverage() {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    private int getRange() {
        if (nums.length == 0) return 0;
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }

    private int[] getHighLowCounts(double avg) {
        int highCount = 0;
        int lowCount = 0;
        for (int num : nums) {
            if (num > avg) highCount++;
            else if (num < avg) lowCount++;
        }
        return new int[] { highCount, lowCount };
    }

    private double getMedian() {
        if (nums.length == 0) return 0;
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int middle = sortedNums.length / 2;
        if (sortedNums.length % 2 == 0) {
            return (sortedNums[middle - 1] + sortedNums[middle]) / 2.0;
        } else {
            return sortedNums[middle];
        }
    }
}

