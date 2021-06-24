#include <stdio.h>

int Main(void)
{
    int A, B, C;
    int num[10] = {
        0,
    };
    scanf("%d %d %d\n", &A, &B, &C);

    int n = A * B * C;

    int var;
    while (n > 0)
    {
        var = n % 10;
        num[var]++;
        n = n / 10;
    }
    for (int i = 0; i < 10; i++)
    {
        printf("%d\n", num[i]);
    }
    return 0;
}