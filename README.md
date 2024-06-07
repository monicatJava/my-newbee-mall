![newbee-logo](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/newbee-logo.png?x-oss-process=image/resize,h_240,w_480)

![Build Status](https://img.shields.io/badge/build-passing-green.svg)
![Version 1.0.0](https://img.shields.io/badge/version-1.0.0-yellow.svg)
[![License](https://img.shields.io/badge/license-GPL3.0-blue.svg)](https://github.com/newbee-ltd/newbee-mall/blob/master/LICENSE)

newbee-mall 專案是一套電商系統，包括 newbee-mall 商城系統及 newbee-mall-admin 商城後臺管理系統，基於 Spring Boot 2.X 及相關技術棧開發。 前臺商城系統包含首頁門戶、商品分類、新品上線、首頁輪播、商品推薦、商品搜索、商品展示、購物車、訂單結算、訂單流程、個人訂單管理、會員中心、幫助中心等模組。 後臺管理系統包含數據面板、輪播圖管理、商品管理、訂單管理、會員管理、分類管理、設定等模組。

目前分支的 Spring Boot 版本為 2.3.7-RELEASE，想要學習和使用其它版本可以直接點選下方的分支名稱跳轉至對應的倉庫分支中。

| 分支名稱                                                    | Spring Boot Version |
| ------------------------------------------------------------ | ------------------- |
| [spring-boot-2.3.7](https://github.com/newbee-ltd/newbee-mall/tree/spring-boot-2.3.7) | 2.3.7-RELEASE       |
| [spring-boot-2.6.x](https://github.com/newbee-ltd/newbee-mall/tree/spring-boot-2.6.x) | 2.6.3               |
| [main](https://github.com/newbee-ltd/newbee-mall)            | 2.7.3               |

新蜂商城線上預覽地址：[http://mall.newbee.ltd](http://mall.newbee.ltd?from=github)，賬號可自行註冊。

**堅持不易，如果覺得專案還不錯的話可以給專案一個 Star 吧，也是對我自 2019 年開始一直更新這個專案的一種鼓勵啦，謝謝各位的支援。**

![newbee-mall-info](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/store/newbee-mall-star.png)

- newbee-mall 對新手開發者十分友好，無需複雜的操作步驟，**僅需 2 秒就可以啟動這個完整的商城專案；**
- newbee-mall **也是一個企業級別的 Spring Boot 大型專案，對於各個階段的 Java 開發者都是極佳的選擇；**
- 你可以把它作為 Spring Boot 技術棧的綜合實踐專案，**newbee-mall 足夠符合要求，且程式碼開源、功能完備、流程完整、頁面互動美觀；**
- 技術棧新穎且知識點豐富，學習后可以提升大家對於知識的理解和掌握，**可以進一步提升你的市場競爭力；**
- 對於部分求職中的 Java 開發者，**你也可以將該專案放入求職簡歷中以豐富你的工作履歷；** 
- **newbee-mall 還有一些不完善的地方，鄙人才疏學淺，望見諒；** 
- **有任何問題都可以反饋給我，我會盡量完善該專案。** 

![](https://raw.githubusercontent.com/newbee-ltd/newbee-mall-vue-app/master/static-files/newbee-mall.png)

## newbee-mall （新蜂商城）系列專案概覽

![newbee-mall-course-2022](https://github.com/newbee-ltd/newbee-mall-cloud/raw/main/static-files/newbee-mall-course-2022.png)

| 專案名稱             | 倉庫地址                                                     | 備註                                                         |
| :------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| newbee-mall          | [newbee-mall in GitHub](https://github.com/newbee-ltd/newbee-mall)<br>[newbee-mall in Gitee](https://gitee.com/newbee-ltd/newbee-mall) | 初始版本、Spring Boot、Thymeleaf、MyBatis、MySQL             |
| newbee-mall-plus     | [newbee-mall-plus in GitHub](https://github.com/newbee-ltd/newbee-mall-plus)<br/>[newbee-mall-plus in Gitee](https://gitee.com/newbee-ltd/newbee-mall-plus) | 升級版本、優惠券、秒殺、支付、Spring Boot、Thymeleaf、MyBatis、MySQL、Redis |
| newbee-mall-cloud    | [newbee-mall-cloud in GitHub](https://github.com/newbee-ltd/newbee-mall-cloud)<br/>[newbee-mall-cloud in Gitee](https://gitee.com/newbee-ltd/newbee-mall-cloud) | 微服務版本、分佈式事務、Spring Cloud Alibaba、Nacos、Sentinel、OpenFeign、Seata |
| newbee-mall-api      | [newbee-mall-api in GitHub](https://github.com/newbee-ltd/newbee-mall-api)<br/>[newbee-mall-api in Gitee](https://gitee.com/newbee-ltd/newbee-mall-api) | 前後端分離、Spring Boot、MyBatis、Swagger、MySQL             |
| newbee-mall-api-go   | [newbee-mall-api-go in GitHub](https://github.com/newbee-ltd/newbee-mall-api-go)<br/>[newbee-mall-api-go in Gitee](https://gitee.com/newbee-ltd/newbee-mall-api-go) | 前後端分離、Go、Gin、MySQL                                   |
| newbee-mall-vue-app  | [newbee-mall-vue-app in GitHub](https://github.com/newbee-ltd/newbee-mall-vue-app)<br/>[newbee-mall-vue-app in Gitee](https://gitee.com/newbee-ltd/newbee-mall-vue-app) | 前後端分離、Vue 2.x、Vant                                    |
| newbee-mall-vue3-app | [newbee-mall-vue3-app in GitHub](https://github.com/newbee-ltd/newbee-mall-vue3-app)<br/>[newbee-mall-vue3-app in Gitee](https://gitee.com/newbee-ltd/newbee-mall-vue3-app) | 前後端分離、Vue3、Vue-Router4、Vuex4、Vant3      |
| vue3-admin           | [vue3-admin in GitHub](https://github.com/newbee-ltd/vue3-admin)<br/>[vue3-admin in Gitee](https://gitee.com/newbee-ltd/vue3-admin) | 前後端分離、Vue3、Element-Plus、Vue-Router4、Vite      |

> 更多 Spring Boot 實戰專案可以關注十三的另一個程式碼倉庫 [spring-boot-projects](https://github.com/ZHENFENG13/spring-boot-projects)，該倉庫中主要是 Spring Boot 的入門學習教程以及一些常用的 Spring Boot 實戰專案教程，包括 Spring Boot 使用的各種示例程式碼，同時也包括一些實戰專案的專案原始碼和效果展示，實戰專案包括基本的 web 開發以及目前大家普遍使用的前後端分離實踐專案等，後續會根據大家的反饋繼續增加一些實戰專案原始碼，擺脫各種 hello world 入門案例的束縛，真正的掌握 Spring Boot 開發。

## 專案演示

- [視訊1：商城專案總覽](https://edu.csdn.net/course/play/26258/326466)
- [視訊2：商城系統介紹](https://edu.csdn.net/course/play/26258/326467)
- [視訊3：商城後臺管理系統介紹](https://edu.csdn.net/course/play/26258/328801)

## 開發及部署文件

- [**Spring Boot 大型線上商城專案實戰教程**](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [專案須知和課程約定](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [2021年12月小冊全新優化升級](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [技術選型之 Spring Boot](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [前期準備工作及基礎環境搭建](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Spring Boot 專案初體驗--專案搭建及啟動](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Spring Boot 之 Web 開發講解](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Thymeleaf 模板引擎技術介紹及整合](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Thymeleaf 語法詳解及編碼實踐](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Spring Boot 實踐之數據庫操作](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Spring Boot 實踐之整合 Mybatis 運算元據庫](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [專案初體驗：啟動和使用新蜂商城](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城功能模組和流程設計詳解](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [前端頁面設計及技術選型](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [頁面佈局製作及跳轉邏輯實現](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Spring Boot 實現驗證碼功能](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城後臺管理系統登錄功能實現](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [登陸攔截器設定並完善身份驗證](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [通用分頁功能設計與開發實踐](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [jqGrid 外掛整合製作分頁效果](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Spring Boot 實踐之檔案上傳處理-1](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Spring Boot 實踐之檔案上傳處理-2](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城輪播圖管理模組開發](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城分類管理模組開發-1](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城分類管理模組開發-2](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城商品類目三級聯動功能實現](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [富文字編輯器 wangEditor 介紹及整合詳解](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城商品編輯頁面製作](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城商品新增功能實現](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城商品管理模組功能實現](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城首頁製作-1](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城首頁製作-2](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城首頁模組配置及功能完善](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城會員的註冊/登錄功能實現](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城搜索商品功能實現](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城購物車功能實現](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城訂單確認頁和訂單產生功能實踐](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城個人訂單列表和訂單詳情頁製作](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城訂單流程功能完善](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [課程總結及展望](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [Spring Boot中的事務處理](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [新蜂商城錯誤頁面製作](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)
- [常見問題彙總講解](https://juejin.cn/book/6844733814074245133?suid=1996368849416216&source=android)

## 聯繫作者

> 大家有任何問題或者建議都可以在 [issues](https://github.com/newbee-ltd/newbee-mall/issues) 中反饋給我，我會慢慢完善這個專案。

- 我的郵箱：2449207463@qq.com
- QQ技術交流群：791509631 719099151

> newbee-mall 在 GitHub 和國內的碼云都建立了程式碼倉庫，如果有人訪問 GitHub 比較慢的話，建議在 Gitee 上檢視該專案，兩個倉庫會保持同步更新。

- [newbee-mall in GitHub](https://github.com/newbee-ltd/newbee-mall)
- [newbee-mall in Gitee](https://gitee.com/newbee-ltd/newbee-mall)

關注公眾號：**程式設計師十三**，回覆"勾搭"進群交流。

![wx-gzh](https://newbee-mall.oss-cn-beijing.aliyuncs.com/wx-gzh/%E7%A8%8B%E5%BA%8F%E5%91%98%E5%8D%81%E4%B8%89-%E5%85%AC%E4%BC%97%E5%8F%B7.png)

## 軟體著作權

>本系統已申請軟體著作權，受國家版權局智慧財產權以及國家計算機軟體著作權保護！

![](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/store/newbee-mall-copyright.png)

## 頁面展示

以下為商城專案的部分頁面，由於篇幅所限，無法一一列舉，重要節點及重要功能的頁面都已整理在下方。

### 商城頁面預覽

- 商城首頁 1

	![index](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/index-01-2020.gif)

- 商城首頁 2

	![index](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/index-02.png)

- 商品搜索

	![search](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/search.png)

- 購物車

	![cart](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/cart.png)
	
- 訂單結算

	![settle](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/settle.png)
			
- 訂單列表

	![orders](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/orders.png)	
	
- 支付頁面

	![settle](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/wx-pay.png)


### 後臺管理頁面

- 登錄頁

	![login](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/manage-login.png)

- 輪播圖管理

	![carousel](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/manage-carousel.png)
	
- 新品上線

    ![config](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/manage-index-config.png)

- 分類管理

	![category](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/manage-category.png)

- 商品管理

	![goods](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/manage-goods.png)

- 商品編輯

	![edit](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/manage-goods-edit-new.png)

- 訂單管理

	![order](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/manage-order.png)

![newbee-mall-info](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/store/newbee-mall-info-3.png)

## 感謝

- [spring-projects](https://github.com/spring-projects/spring-boot)
- [thymeleaf](https://github.com/thymeleaf/thymeleaf)
- [mybatis](https://github.com/mybatis/mybatis-3)
- [ColorlibHQ](https://github.com/ColorlibHQ/AdminLTE)
- [tonytomov](https://github.com/tonytomov/jqGrid)
- [t4t5](https://github.com/t4t5/sweetalert)
- [skytotwo](https://github.com/skytotwo/Alipay-WeChat-HTML)
- [EasyCaptcha](https://github.com/whvcse/EasyCaptcha)
- [wangeditor-team](https://github.com/wangeditor-team/wangEditor)
- [VincentGarreau](https://github.com/VincentGarreau/particles.js)
- [Vue](https://github.com/vuejs/vue)
- [Vant](https://github.com/youzan/vant)
