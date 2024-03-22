#include <stdio.h>
int main()
{
    int intValue = 0;
    printf("%s", "정수를 입력하세요 : ");
    scanf("%d", &intValue); // Console(표준 입력)을 통해 사용자에게서 값을 입력 받습니다.
    printf("정수 출력 결과 : %d\n", intValue); // Console(표준 출력)을 통해 사용자에게 값을 출력합니다.
    fflush(stdin);

    double doubleValue = 0.0;
    printf("%s", "실수를 입력하세요 : ");
    scanf("%lf", &doubleValue);
    printf("실수 출력 결과 : %lf\n", doubleValue);
    fflush(stdin);

    char charValue = 'a'; // 문자 하나는 작은 따옴표를 사용합니다. (Python과 달리 엄격함)
    printf("%s", "문자를 입력하세요 : ");
    scanf("%c", &charValue);
    printf("문자 출력 결과 : %c\n", charValue);
    fflush(stdin);

    char charArrayValue[100] = "Hello"; // 문자 배열 (문자열)은 큰 따옴표를 사용합니다.
    printf("%s", "문자열을 입력하세요 : ");
    scanf("%s", charArrayValue);     // 배열을 입력 받을 때는 앰퍼샌드(&)를 붙이지 않습니다.
    printf("문자열 출력 결과 : %s\n", charArrayValue);
    fflush(stdin);
}
