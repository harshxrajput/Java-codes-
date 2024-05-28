#include <stdio.h>
#include <stdlib.h>

void bubble_sort(int A[], int n)
{

    printf("unsorted array : ");
    for (int l = 0; l < n; l++)
    {
        printf("%d ", A[l]);
    }

    for (int i = 0; i <= n - 1; i++)
    {
        int ptr = 0;
        while (ptr <= n - i)
        {
            if (A[ptr] > A[ptr + 1])
            {
                int temp = A[ptr];
                A[ptr] = A[ptr + 1];
                A[ptr + 1] = temp;
            }
            ptr = ptr + 1;
        }
    }
    printf("\n");
    printf("sorted array : ");
    for(int k=0;k<n;k++){
        printf("%d ", A[k]);
    }
}

int main()
{
    int Arr[] = {2, 4, 7, 9, 5, 8, 1};
    bubble_sort(Arr, sizeof(Arr) / sizeof(Arr[0]));
    return 0;
}