#include <stdio.h>

int main(void)
{
    int input, A, B;
    scanf("%d\n", &input);
    for (int i = 0; i < input; i++)
    {
        scanf("%d %d\n", &A, &B);
        printf("%d\n", A + B);
    }
    return 0;
}