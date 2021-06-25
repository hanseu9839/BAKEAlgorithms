#include <stdio.h>

int main(void)
{
    int N;
    scanf("%d", &N);
    for (int j = 1; j < 10; j++)
    {
        printf("%d * %d = %d\n", N, j, N * j);
    }
    return 0;
}