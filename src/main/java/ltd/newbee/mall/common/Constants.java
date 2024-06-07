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
 * @apiNote 常量配置
 */
public class Constants {
    //public final static String FILE_UPLOAD_DIC = "/opt/image/upload/";//上傳檔案的預設url字首，根據部署設定自行修改
    public final static String FILE_UPLOAD_DIC = "D:\\upload\\";//上傳檔案的預設url字首，根據部署設定自行修改

    public final static int INDEX_CAROUSEL_NUMBER = 5;//首頁輪播圖數量(可根據自身需求修改)

    public final static int INDEX_CATEGORY_NUMBER = 10;//首頁一級分類的最大數量

    public final static int SEARCH_CATEGORY_NUMBER = 8;//搜索頁一級分類的最大數量

    public final static int INDEX_GOODS_HOT_NUMBER = 4;//首頁熱賣商品數量
    public final static int INDEX_GOODS_NEW_NUMBER = 5;//首頁新品數量
    public final static int INDEX_GOODS_RECOMMOND_NUMBER = 10;//首頁推薦商品數量

    public final static int SHOPPING_CART_ITEM_TOTAL_NUMBER = 13;//購物車中商品的最大數量(可根據自身需求修改)

    public final static int SHOPPING_CART_ITEM_LIMIT_NUMBER = 5;//購物車中單個商品的最大購買數量(可根據自身需求修改)

    public final static String MALL_VERIFY_CODE_KEY = "mallVerifyCode";//驗證碼key

    public final static String MALL_USER_SESSION_KEY = "newBeeMallUser";//session中user的key

    public final static int GOODS_SEARCH_PAGE_LIMIT = 10;//搜索分頁的預設條數(每頁10條)

    public final static int ORDER_SEARCH_PAGE_LIMIT = 3;//我的訂單列表分頁的預設條數(每頁3條)

    public final static int SELL_STATUS_UP = 0;//商品上架狀態
    public final static int SELL_STATUS_DOWN = 1;//商品下架狀態

}
