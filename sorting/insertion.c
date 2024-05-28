#include <stdio.h>
#include <stdlib.h>
void insertion_sort(int A[], int n)
{

    printf("unsorted array : ");
    for (int l = 0; l < n; l++)
    {
        printf("%d ", A[l]);
    }

    for (int i = 1; i < n; i++)
    {
        int key = A[i];
        int j = i - 1;
        while (j >= 0 && A[j] > key)
        {
            A[j + 1] = A[j];
            j = j - 1;
        }
        A[j + 1] = key;
    }
    printf("\n");
    printf("sorted array : ");
    for (int k = 0; k < n; k++)
    {
        printf("%d ", A[k]);
    }
}
int main()
{
    int Arr[] = {2, 4, 7, 9, 5, 8, 1};
    insertion_sort(Arr, sizeof(Arr) / sizeof(Arr[0]));
    return 0;
}