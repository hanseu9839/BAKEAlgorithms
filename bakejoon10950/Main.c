#include <stdio.h>

int main(void)
{
    int input, A, B;
    scanf("%d\n", &input);

    for (int j = 0; j < input; j++)
    {
        scanf("%d %d\n", &A, &B);
        printf("%d\n", A + B);
    }

    return 0;
}
