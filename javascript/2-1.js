//  년, 월, 일을 전달하면 해당 날짜의 요일을 '월', '화', '수', '목', '금', '토', '일' 문자열로 반환해주는 함수 getWeekDay를 만든다.
// 화
// 월

console.log(getWeekDay(2022, 6, 21));       // 2022년 6월 21일
console.log(getWeekDay(2022, 12, 12));      // 2022년 12월 12일

function getWeekDay(year, month, date) {
    // 코드 작성
    const week = ['일', '월', '화', '수', '목', '금', '토'];
    const dayOfWeek = week[new Date(year+ '-' + month + '-' + date).getDay()];
    return dayOfWeek;
}
