//Student 생성자 함수를 통해 생성 된 3명의 학생 객체를 studentList 배열에 담았다.
// 해당 배열을 전달하여 score 내림차순 기준으로 정렬해주는 sortFromScore(arr) 함수,
// 해당 배열을 전달하여 lastName과 firstName을 합성하여 name 속성으로 만들어 반환하는 makeFullName 함수를 작성한다.

//[
//   Student { firstName: '관순', lastName: '유', score: 80 },
//   Student { firstName: '보고', lastName: '장', score: 70 },
//   Student { firstName: '길동', lastName: '홍', score: 60 }
// ]
// [
//   { name: '유관순', score: 80 },
//   { name: '장보고', score: 70 },
//   { name: '홍길동', score: 60 }
// ]

function Student(firstName, lastName, score){
    this.firstName = firstName;
    this.lastName = lastName;
    this.score = score;
}

const studentList = [
    new Student('길동', '홍', 60),
    new Student('보고', '장', 70),
    new Student('관순', '유', 80)
];

sortFromScore(studentList);
console.log(studentList);
console.log(makeFullName(studentList));

function sortFromScore (arr) {
    // 코드 작성
    arr.sort((a, b) => b.score - a.score);
}

function makeFullName(arr){
    // 코드 작성
    const combinedArray = arr.map(item =>{
        return {
            name : `${item.lastName} ${item.firstName}`,
            score: item.score
        };
    });
    console.log(combinedArray);
}