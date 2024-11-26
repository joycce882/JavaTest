package JAVA_2024_11_23;

import java.util.Random;

// TODO: 2024/11/23 评委打分，6个评委打分，分数【0~100】,去掉一个最高分去掉一个最低分剩下的平均
public class judge_score {
    public static void main(String[] args) {
        double[] score = score();
        System.out.println("最后的得分为："+calc(score));

    }

    public static double[] score() {
        Random r = new Random();
        double[] score = new double[6];
        for (int i = 0; i < 6; i++) {
            score[i] = r.nextDouble(0,101);
        }
        return score;
    }

    public static double calc(double[] score) {
        double max = score[0];
        double min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max)
                max = score[i];
            else if (score[i] < min) {
                min = score[i];

            }

        }
        // 计算平均数
        double sum = 0;
        int count = 0;
        for (double v : score) {
            if (v != max && v != min) {
                sum += v;
                count++;
            }
        }
        return (double) sum/count;
    }
}
