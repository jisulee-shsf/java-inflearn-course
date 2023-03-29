####
## 제어문
####
#### ► [_01_If1_230328]
- 주어진 조건을 판단해 참인 결과를 수행하는 단수 조건의 if문 실습
- if문 내에 2개 이상의 문장을 실행할 경우, {} 표기 필수 확인
#### ► [_02_If2_230328]
- 복수 조건의 if문 실습
- 논리 연산자(&&, ||) 및 논리 부정 연산자(!)를 사용한 복수 조건 생성
####
#### ► [_03_Else_230328]
- if문의 조건이 거짓인 경우 수행되는 else문 실습
####
#### ► [_04_ElseIf_230328]
- 이전 조건이 거짓인 경우 수행되는 다중 조건 판단의 else if문 실습
####

``` Java
if (condition1) {
    // code block
} else if (condition2) {
    // code block
} else {
    // code block
}
```
##
#### ► [_05_Switch_230328]
- if문 보다 더욱 정형화된 조건 판단문인 switch문 실습
- if ... else문과 차이 비교
####
``` Java
switch (expression) {
    case x:
        // code block
        break;
    case y:
        // code block
        break;
    default:
        // code block
}
```
##
#### ► [_06_For_230328]
- 지정된 횟수에 따라 조건이 참인 결과를 반복해서 수행하는 for문 실습
- 짝수 ・ 홀수 출력 / 숫자 거꾸로 출력 / 숫자 총합 출력 실습 
``` Java
for (statement 1; statement 2; statement 3) {
    // code block
}
```
####
##
#### ► [_07_While_230328]
- 지정된 횟수가 없을 때, 조건이 참인 동안 결과를 반복해서 수행하는 while문 실습
- 조건이 참인지 확인하기 전 한 번 실행한 후, 조건이 참인 동안 결과를 반복해서 수행하는 do-while문 실습
``` Java
while (condition) {
    // code block
}
```
``` Java
do {
    // code block
}
while (condition);
```
####
##
#### ► [_08_NestedLoop_230329] & [_09_MultipleTable_230329]
- 반복문 안에 반복문을 배치하는 중첩 반복의 nested loop문 실습
- nested loop문을 활용한 구구단 만들기 실습
``` Java
// Outer loop
for (statement 1; statement 2; statement 3) {
    // code block
    // Inner loop
    for (statement 1; statement 2; statement 3) {
        // code block
    }
} 
```
####
##
#### ► [_10_Break_230329] & [_11_Continue_230329]
- 반복문 내에 지정된 조건이 참일 경우, 반복문을 벗어날 수 있는 break 실습
- 반복문 내에 지정된 조건이 참인 경우, 하나의 반복은 건너뛰고 다음 반복을 계속하는 countinue 실습
``` Java
for (statement 1; statement 2; statement 3) {
    if (condition) {
        break;
    }
    // code block
}
```
####
##
#### ► [12_Quiz_230329]
- 주차 정산 프로그램 작성하기
- if문을 활용한 조건 설정으로 풀이 진행
####
####
