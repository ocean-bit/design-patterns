package com.ocean.strategy;

/**
 * 现金收费抽象父类
 */
public abstract class CashSuper {
    /**
     * 接受原价，返回打折后的结果
     * @param money
     * @return
     */
    public abstract double acceptCash(double money);

    enum CashType{
        /** 正常收费 */
        NORMAL(1, "正常收费"),
        /** 折扣收费 */
        REBATE(2, "折扣收费"),
        /** 满减收费 */
        RETURN(3, "满减收费")
        ;
        private Integer id;
        private String type;

        CashType(Integer id, String type) {
            this.id = id;
            this.type = type;
        }

        public static CashType getById(int id){
            CashType find = null;
            for(CashType cashType : CashType.values()){
                if(id == cashType.id){
                    find = cashType;
                }
            }
            return find;
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
