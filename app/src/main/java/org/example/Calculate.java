package org.example;

public class Calculate {

    /**
     * 年齢から1人分の基本料金を計算する。
     *
     * @param age 年齢
     * @return 1人分の基本料金
     */
    public int getIndividualFee(int age) {
        if (age <= 12) {
            return 1000;
        }

        return 2000;
    }

    /**
     * 年齢と人数からグループ全体の料金を計算する。
     * 10人以上の場合は合計料金を10%割引する。
     *
     * @param age       グループ全員の年齢
     * @param groupSize 人数
     * @return グループ全体の料金
     */
    public int getTotalFee(int age, int groupSize) {
        int individualFee = getIndividualFee(age);
        int totalFee = individualFee * groupSize;

        if (groupSize >= 10) {
            totalFee = totalFee * 9 / 10;
        }

        return totalFee;
    }
}