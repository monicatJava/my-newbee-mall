/**
 * 嚴肅聲明：
 * 開源版本請務必保留此註釋頭資訊，若刪除我方將保留所有法律責任追究！
 * 本系統已申請軟體著作權，受國家版權局智慧財產權以及國家計算機軟體著作權保護！
 * 可正常分享和學習原始碼，不得用於違法犯罪活動，違者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版權所有，侵權必究！
 */
package ltd.newbee.mall.common;

/**
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link https://github.com/newbee-ltd
 * @apiNote 訂單狀態:0.無 1.支付寶 2.微信支付
 */
public enum PayTypeEnum {

    DEFAULT(-1, "ERROR"),
    NOT_PAY(0, "無"),
    ALI_PAY(1, "支付寶"),
    WEIXIN_PAY(2, "微信支付");

    private int payType;

    private String name;

    PayTypeEnum(int payType, String name) {
        this.payType = payType;
        this.name = name;
    }

    public static PayTypeEnum getPayTypeEnumByType(int payType) {
        for (PayTypeEnum payTypeEnum : PayTypeEnum.values()) {
            if (payTypeEnum.getPayType() == payType) {
                return payTypeEnum;
            }
        }
        return DEFAULT;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
