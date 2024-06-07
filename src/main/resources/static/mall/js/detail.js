var newbeeSwiper = new Swiper('.swiper-container', {
    //設定自動播放
    autoplay: {
        delay: 3000,
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