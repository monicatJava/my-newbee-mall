var newbeeSwiper = new Swiper('.swiper-container', {
    //設定自動播放
    autoplay: {
        delay: 2000,
        disableOnInteraction: false
    },
    //設定無限循環播放
    loop: true,
    //設定圓點指示器
    pagination: {
        el: '.swiper-pagination',
    },
    //設定上下頁按鈕
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    }
})

$('.all-sort-list > .item').hover(function () {
    var eq = $('.all-sort-list > .item').index(this),				//獲取目前滑過是第幾個元素
        h = $('.all-sort-list').offset().top,						//獲取目前下拉菜單距離視窗多少畫素
        s = $(window).scrollTop(),									//獲取遊覽器滾動了多少高度
        i = $(this).offset().top,									//目前元素滑過距離視窗多少畫素
        item = $(this).children('.item-list').height(),				//下拉菜單子類內容容器的高度
        sort = $('.all-sort-list').height();						//父類分類列表容器的高度

    if (item < sort) {												//如果子類的高度小於父類的高度
        if (eq == 0) {
            $(this).children('.item-list').css('top', (i - h));
        } else {
            $(this).children('.item-list').css('top', (i - h) + 1);
        }
    } else {
        if (s > h) {												//判斷子類的顯示位置，如果滾動的高度大於所有分類列表容器的高度
            if (i - s > 0) {											//則 繼續判斷目前滑過容器的位置 是否有一半超出視窗一半在視窗內顯示的Bug,
                $(this).children('.item-list').css('top', (s - h) + 2);
            } else {
                $(this).children('.item-list').css('top', (s - h) - (-(i - s)) + 2);
            }
        } else {
            $(this).children('.item-list').css('top', 3);
        }
    }

    $(this).addClass('hover');
    $(this).children('.item-list').css('display', 'block');
}, function () {
    $(this).removeClass('hover');
    $(this).children('.item-list').css('display', 'none');
});