// 오늘 흐른 시간을 초 단위로 알려주는 getSecondsToday 함수와 오늘 남은 시간을 초단위로 알려주는 getSecondsToTomorrow 함수를 만든다.
//xxxxx초나 흘렀습니다. 시간을 소중히 씁시다^^
// xxxxx초 밖에 안 남았습니다. 다시는 오지 않는 오늘입니다^^
console.log(getSecondsToday());
console.log(getSecondsToTomorrow());

function getSecondsToday() {
    // 코드 작성
    let today = new Date();
    const date1 = new Date(2024, 10, 14, 0, 0, 0);
    const date2 = new Date(today.getFullYear(), today.getMonth(), today.getDate(), today.getHours(), today.getMinutes(), today.getSeconds());
    beforeCount = (date2.getTime() - date1.getTime()) * -1;
    return beforeCount + '초나 흘렀습니다. 시간을 소중히 씁시다^^';
}

function getSecondsToTomorrow() {
    // 코드 작성
    const date1 = new Date();
    const date2 = new Date(2024, 10, 15, 0, 0, 0);
    beforeCount = (date2.getTime() - date1.getTime());
    return beforeCount + '초 밖에 안 남았습니다. 다시는 오지 않는 오늘입니다^^'
}
