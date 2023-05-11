####
## 제어문
####
#### ► [_01_If1_230328]
- if문의 조건식이 참일 때, 블럭을 수행하는 단일 조건의 if문 실습
#### ► [_02_If2_230328]
- 논리 연산자(&&, ||) 및 논리 부정 연산자(!)를 사용한 이중 조건의 if문 실습
####
#### ► [_03_Else_230328]
- if문의 조건식이 거짓일 때, else블럭이 수행되는 if-else문 실습
####
#### ► [_04_ElseIf_230328]
- 처리해야 할 경우의 수가 3개 이상인 경우, 결과가 참인 조건식의 블럭만 수행하고 벗어나는 if-else if문 실습
- 결과가 참인 조건식이 하나도 없으면 수행되는 else블럭의 경우, 생략할 수 있음을 확인
####
#### ► [_05_Switch_230328]
- 단 하나의 조건식으로 많은 경우의 수를 간결하게 처리할 수 있는 switch문 실습
- if-else if문: 여러 조건 혹은 범위에 해당하는 조건이 있는 경우에 적절 / switch문: 명확한 케이스가 있는 경우에 적절
##
#### ► [_06_For_230328]
- 반복 횟수를 알고 있을 때, 조건식이 참인 동안 결과를 반복해서 수행하는 for문 실습
- 짝수 ・ 홀수 출력 / 숫자 거꾸로 출력 / 숫자 총합 출력 실습 
``` Java
for (statement 1; statement 2; statement 3) {
    // code block
}
```
####
#### ► [_07_While_230328]
- 반복 횟수를 알지 못할 때, 조건식이 참인 동안 결과를 반복해서 수행하는 while문 실습
- while문의 조건식과 블럭 순서를 바꿔 최소한 한 번의 수행을 보장하는 do-while문 실습
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
- for문 안에 또 다른 for문을 포함하는 nested loop 실습
- 사각형 ・ 삼각형 ・ 구구단 만들기 실습
``` Java
// outer loop
for (statement 1; statement 2; statement 3) {
    // code block
    // inner loop
    for (statement 1; statement 2; statement 3) {
        // code block
    }
} 
```
####
##
#### ► [_10_Break_230329] & [_11_Continue_230329]
- 특정 조건을 만족할 때, 반목문을 벗어나는 break 실습
- 반복문 내에 조건식이 참일 때, 반복문의 끝으로 이동해 다음 반복으로 넘어가는 continue 실습
``` Java
for (statement 1; statement 2; statement 3) {
    if (condition) {
        break;
    }
    // code block
}
```
``` Java
for (statement 1; statement 2; statement 3) {
    if (condition) {
        continue;
    }
    // code block
}
```
####
##
#### ► [12_Quiz_230329]
- 주차 정산 프로그램 작성
####
####
